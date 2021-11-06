package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.On.on;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.QT.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.StreamSources.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class FetchTest {
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
            Fetch.fetch(
                "addresses",
                search("people", q("*:*"), qt(EXPORT), fl("username", "firstName", "lastName"), sort("username asc")),
                fl("streetAddress", "city", "state", "country", "zip"),
                on("username","userId")
            );

        assertEquals(expected, expression.toString());
    }
}
