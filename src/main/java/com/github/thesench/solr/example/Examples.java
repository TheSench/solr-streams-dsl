package com.github.thesench.solr.example;

import static com.github.thesench.solr.dsl.stream.expr.decorators.ReduceStreams.reduce;
import static com.github.thesench.solr.dsl.stream.expr.decorators.SelectStreams.select;
import static com.github.thesench.solr.dsl.stream.expr.params.ByClause.by;
import static com.github.thesench.solr.dsl.stream.expr.params.NClause.n;
import static com.github.thesench.solr.dsl.stream.expr.params.ReducerClause.group;
import static com.github.thesench.solr.dsl.stream.expr.params.SortClause.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.q;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.rows;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.search;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.solrj.io.Tuple;
import org.apache.solr.client.solrj.io.comp.ComparatorOrder;
import org.apache.solr.client.solrj.io.comp.FieldComparator;
import org.apache.solr.client.solrj.io.eq.FieldEqualitor;
import org.apache.solr.client.solrj.io.ops.GroupOperation;
import org.apache.solr.client.solrj.io.stream.ReducerStream;
import org.apache.solr.client.solrj.io.stream.SearchStream;
import org.apache.solr.client.solrj.io.stream.SelectStream;
import org.apache.solr.client.solrj.io.stream.SolrStream;
import org.apache.solr.client.solrj.io.stream.StreamContext;
import org.apache.solr.client.solrj.io.stream.TupleStream;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.client.solrj.io.stream.expr.StreamFactory;
import org.apache.solr.common.params.ModifiableSolrParams;

public class Examples {
    private static String solrUrl = "http://localhost:8983/solr/techproducts";
    public static void main(String[] args) {
        try {
            System.out.println("*************************");
            System.out.println("searchUsingClasses");
            System.out.println("*************************");
            searchUsingClasses();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("*************************");
            System.out.println("searchUsingClasses_v2");
            System.out.println("*************************");
            searchUsingClasses_v2();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("*************************");
            System.out.println("searchUsingStrings");
            System.out.println("*************************");
            searchUsingStrings();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("*************************");
            System.out.println("searchUsingDsl");
            System.out.println("*************************");
            searchUsingDsl();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void searchUsingClasses() throws IOException {
        // If I'm not going across Solr clusters, can't Solr just figure the zkHost out?
        String zkHost = "localhost:9983";
        StreamFactory factory = new StreamFactory().
            withCollectionZkHost("techproducts", zkHost);
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
    }

    public static void searchUsingClasses_v2() throws IOException {
        String zkHost = "localhost:9983";
        StreamFactory factory = new StreamFactory().
            withCollectionZkHost("techproducts", zkHost);
        StreamContext context = new StreamContext();

        // Hopefully these parameters are valid, but there's currently no other way to build a SearchStream
        SelectStream selectStream =
            new SelectStream(
                new ReducerStream(
                    new SearchStream(
                        new StreamExpression("search")
                            .withParameter("techproducts")
                            .withParameter(new StreamExpressionNamedParameter("q", "popularity:[6 TO 10]"))
                            .withParameter(new StreamExpressionNamedParameter("rows", "25"))
                            .withParameter(new StreamExpressionNamedParameter("sort", "manu asc, name asc, popularity desc")),
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
    }

    public static void searchUsingStrings() throws IOException {
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
    }

    public static void searchUsingDsl() throws IOException {
        StreamExpression streamExpression =
            select(
                reduce(
                    search(
                        "techproducts",
                        q("popularity:[6 TO 10]"),
                        rows(25),
                        sort("manu asc", "name asc", "popularity desc")
                    ),
                    by("manu"),
                    group(sort("name asc"), n(10))
                ),
                "manu AS manufacturer",
                "manu_id_s AS manufacturerId",
                "group"
            );
        ModifiableSolrParams paramsLoc = new ModifiableSolrParams();
        paramsLoc.set("expr", streamExpression.toString());
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
    }

    public static void readUntilEof(TupleStream solrStream) throws IOException {
        for(Tuple tuple = solrStream.read(); !tuple.EOF; tuple = solrStream.read()) {
            System.out.println(tuple.get("manufacturer"));
        }
    }
}
