# Solr Stream DSL

## Overview

This project aims to provide a safe and ergonomic way to build [Solr streaming expressions](https://solr.apache.org/guide/8_10/streaming-expressions.html).

## Why this project?

At the time of putting this together, SolrJ does not provide a clean and easy way to build out stream expressions.  The current mechanism involves newing up a series of classes for each stream and adding a bunch of parameters to them.  Ideally, a developer would be able to build out a Solr streams expression in a way that looked very similar to the expression itself, making it clear to see what the expression was doing at a glance.

The [recommended approach](https://lucidworks.com/post/streaming-expressions-in-solrj/) at this time seems to be building out the expression as a string.  This approach, although much less verbose than using the various constructors provided by SolrJ, is very prone to human-error.  One can easily leave off a parenthesis or comma, as well as passing in the wrong type or format of input into one of the stream expressions.

## How does this project solve that?

This project provides a rich DSL, in the form of static methods, that allows a developer to build out stream expressions using method signatures that look very similar to the stream functions themselves.  Since these are method calls, rather than strings, the compiler will check your parentheses/commas for you.  Since the parameters are statically typed, you cannot invoke them with the wrong types of inputs.

## Example

That all sounds great, but what does it look like in practice?  Here is a simple example of performing a search on some items, and then piping the results of that into a fetch to get category information from other records.

```java
productQuery = select(
    fetch(
        solrCollection, 
        search(
            solrCollection,
            q(String.join(" ", query)),
            fl("id", "categoryId_s", "score", "name_s", "description_s"),
            fq("type_s:(USER WORKER)"),
            rows(searchResultSize)
        ),
        fl("name_s AS categoryName_s", "description_s as categoryDescription_s"),
        on("categoryId_s", "id")
    )
);
```