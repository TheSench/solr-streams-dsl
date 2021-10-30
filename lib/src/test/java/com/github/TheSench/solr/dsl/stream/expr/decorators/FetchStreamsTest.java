package com.github.TheSench.solr.dsl.stream.expr.decorators;

import static com.github.TheSench.solr.dsl.stream.expr.decorators.FetchStreams.fetch;
import static com.github.TheSench.solr.dsl.stream.expr.params.FieldListClause.fl;
import static com.github.TheSench.solr.dsl.stream.expr.params.OnClause.on;
import static com.github.TheSench.solr.dsl.stream.expr.sources.RequestHandler.EXPORT;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.q;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.qt;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class FetchStreamsTest {
    @Test
    void fetchTest() {
        String expected =
            "fetch(" +
                "addresses," +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"username,firstName,lastName\",sort=\"username asc\")," +
                "fl=\"streetAddress,city,state,country,zip\"," +
                "on=\"username=userId\"" +
            ")";

        StreamExpression expression =
            fetch(
                "addresses",
                search("people", q("*:*"), qt(EXPORT), fl("username", "firstName", "lastName"), sort("username asc")),
                fl("streetAddress", "city", "state", "country", "zip"),
                on("username","userId")
            );

        assertEquals(expected, expression.toString());
    }
}
