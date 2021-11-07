# Solr Stream DSL

## Overview

This project aims to provide a safe and ergonomic way to build [Solr streaming expressions](https://solr.apache.org/guide/8_10/streaming-expressions.html).

## Why this project?

At the time of putting this together, SolrJ does not provide a clean and easy way to build out stream expressions.  The current mechanism involves newing up a series of classes for each stream and adding a bunch of parameters to them.  Ideally, a developer would be able to build out a Solr streams expression in a way that looked very similar to the expression itself, making it clear to see what the expression was doing at a glance.

The [recommended approach](https://lucidworks.com/post/streaming-expressions-in-solrj/) at this time seems to be building out the expression as a string.  This approach, although much less verbose than using the various constructors provided by SolrJ, is very prone to human-error.  One can easily leave off a parenthesis or comma, as well as passing in the wrong type or format of input into one of the stream expressions.

## How does this project solve that?

This project provides a rich DSL, in the form of static methods, that allows a developer to build out stream expressions using method signatures that look very similar to the stream functions themselves.  Since these are method calls, rather than strings, the compiler will check your parentheses/commas for you.  Since the parameters are statically typed, you cannot invoke them with the wrong types of inputs.

## Example

That all sounds great, but what does it look like in practice?  Here is a simple example using the Solr techproducts tutorial collection.  For this example, we will perform a simple search that selects items with a popularity of 6-10, grouped by manufacturer.  We will then use `select` trim down the group key to just the manufacturer name/id.

Here is the streaming expression we will be building.
```javascript
select(
    reduce(
        search(
            techproducts,
            q="popularity:[6 TO 10]",
            rows="25",
            sort="manu asc, name asc, popularity desc"
        ),
        by="manu",
        group(sort="name asc", n="10")
    ),
    manu,
    manu_id_s,
    group
)
```

### Using SolrJ Classes

First, let's try to build this stream using the various TupleStream classes that SolrJ provides:

```java
// If I'm not going across Solr clusters, can't Solr just figure the zkHost out?
String ZK_ensemble_string = "localhost:9983";
StreamFactory factory = new StreamFactory().
    withCollectionZkHost("techproducts", ZK_ensemble_string);
StreamContext context = new StreamContext();

// Build up our innner search()
// Hopefully these parameters are valid, but there's currently no other way to build a SearchStream
StreamExpression searchExpression = new StreamExpression("search")
    .withParameter("techproducts")
    .withParameter(new StreamExpressionNamedParameter("q", "popularity:[6 TO 10]"))
    .withParameter(new StreamExpressionNamedParameter("rows", "25"))
    .withParameter(new StreamExpressionNamedParameter("sort", "manu asc, name asc, popularity desc"));
SearchStream searchStream = new SearchStream(searchExpression, factory);

// Now wrap it with reduce()
// Yay, we have strongly typed parameters this time!
ReducerStream reduceStream = new ReducerStream(
    searchStream,
    new FieldEqualitor("manu"),
    new GroupOperation(new FieldComparator("name", ComparatorOrder.ASCENDING), 10));

// And finally wrap that with our select()
Map<String, String> fields = new HashMap<String, String>();
// Either nothing is aliased, or everything is aliased...
fields.put("manu", "manufacturer");
fields.put("manu_id_s", "manufacturerId");
fields.put("group", "group");
SelectStream selectStream = new SelectStream(reduceStream, fields);
selectStream.setStreamContext(context);
try {
    selectStream.open();
    readUntilEof(selectStream);
} finally {
    selectStream.close();
}
```

That's a lot of code, and it's not very easy to tell what's going on at a first glance.  Let's see if we can refactor it a bit to draw out the shape of the stream expression.

### Using SolrJ Classes - take 2

We can nest stream constructors to create something that more closely resembles our streaming expression.  Here's the updated code.  We now have a `select` that wraps a `reduce` that wraps a `search`.  It's still a bit messy though and hard to process at a glance.

```java
// If I'm not going across Solr clusters, can't Solr just figure the zkHost out?
String zkHost = "localhost:9983";
StreamFactory factory = new StreamFactory().
    withCollectionZkHost("techproducts", zkHost);
StreamContext context = new StreamContext();

SelectStream selectStream =
    new SelectStream(
        new ReducerStream(
            new SearchStream(
                // Still hoping these parameters are valid
                new StreamExpression("search")
                    .withParameter("techproducts")
                    .withParameter(new StreamExpressionNamedParameter("q", "popularity:[6 TO 10]"))
                    .withParameter(new StreamExpressionNamedParameter("rows", "25"))
                    .withParameter(new StreamExpressionNamedParameter("sort", "manu asc, name asc, popularity desc")),
                // What's this have to do with a searchStream?
                factory
            ),
            new FieldEqualitor("manu"),
            new GroupOperation(new FieldComparator("name", ComparatorOrder.ASCENDING), 10)
        ),
        Map.of(
            "manu", "manufacturer",
            "manu_id_s", "manufacturerId",
            "group", "group"
        )
    );
selectStream.setStreamContext(context);
try {
    selectStream.open();
    readUntilEof(selectStream);
} finally {
    selectStream.close();
}
```

### Using Strings

As an alternative approach, we can simply craft a string that represents our streaming expression.

```java
// Hopefully I don't miss a parenthesis or comma here...
// I also have no idea if I'm passing the right parametrs to everything...
String cexpr =  "select(" +
                    "reduce(" +
                        "search(" +
                            "techproducts," +
                            "q=\"popularity:[6 TO 10]\"," +
                            "rows=\"25\"," +
                            "sort=\"manu asc, name asc, popularity desc\"" +
                        ")," +
                        "by=\"manu\"," +
                        "group(sort=\"name asc\", n=\"10\")" +
                    ")," +
                    "manu as manufacturer," +
                    "manu_id_s as manufacturerId," +
                    "group" +
                ")";

// Now let's pass our expression to Solr and hope it all works...
ModifiableSolrParams paramsLoc = new ModifiableSolrParams();
paramsLoc.set("expr", cexpr);
paramsLoc.set("qt", "/stream");
TupleStream solrStream = new SolrStream(solrUrl, paramsLoc);
StreamContext context = new StreamContext();
solrStream.setStreamContext(context);
try {
    solrStream.open();
    readUntilEof(solrStream);
} finally {
    solrStream.close();
}
```

This looks a _lot_ closer to the stream we're building; it's very easy to see the shape and know that we're building the right expression.  We also no longer need to specify the zkHost.  This looks like a huge improvement.

Unfortunately, it's not all good.  We've now lost all parameter validation.  Not all of the `TupleStream` classes allowed us to provide strongly typed parameters, but at least many of them did.  With strings, we've lost all of it.  Additionally, we've now opened ourselves up to a whole new class of issues: we now have the possibility of forgetting or misplacing something as simple as a `)` or `,` character, something that the compiler would have warned us of with `TupleStream`s.  We've gained readability, but at the cost of safety.

### Solr Streams DSL

This is where this library fills the gaps.  Here's how this same stream would be built using this library:

```java
// We  could use Strings as well, but declaring Fields will
// allow us to not rely on "magic strings" and make it easier
// to rename them in the future.  Additionally, it allows us 
// to use the Field APIs for sorting/aliasing.
// We can now also Find References on a field and see every
// place we use it, including sorts/aliases.
Field manu = new Field("manu");
Field name = new Field("name");
Field popularity = new Field("popularity");
Field manu_id_s = new Field("manu_id_s");
Field group = new Field("group");

StreamExpression streamExpression =
    select(
        reduce(
            search(
                "techproducts",
                q("popularity:[6 TO 10]"),
                rows(25),
                sort(manu.asc(), name.asc(), popularity.desc())
            ),
            by(manu),
            group(sort(name.asc()), n(10))
        ),
        // No need to care if we use "field as alias" or "alias:field here.
        // We just create an Alais and which format to use is handled for us.
        manu.as("manufacturer"),
        manu_id_s.as("manufacturerId"),
        group
    );

ModifiableSolrParams paramsLoc = new ModifiableSolrParams();
paramsLoc.set("expr", streamExpression.toString());
paramsLoc.set("qt", "/stream");
TupleStream solrStream = new SolrStream(solrUrl, paramsLoc);
solrStream.setStreamContext(new StreamContext());
try {
    solrStream.open();
    readUntilEof(solrStream);
} finally {
    solrStream.close();
}
```

This gives us the best of both worlds.  Our expression is still clearly readable, like the `String` implementation.  We even gain a bit in in that we get some syntax coloring and we no longer need to escape `"` characters all over.  Additionally, each of the stream methods like `select`, `reduce`, or `group` are all strongly typed.  When building a `search`, we must pass in a collection name, followed by zero-or-more _search_ parameters.  If we try to pass an `on` clause, for instance, the compiler will complain that it's not a valid parameter.  The decorator `reduce` takes in a stream, a `by` clause, and a reducer (`group` or `distinct`).  Those are our only options, and they're all required.