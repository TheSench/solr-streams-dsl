package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.On.on;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.QT.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.sources.Search;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

class IntersectTest {
    @Test
    void intersect_withOneField() {
        String expected =
            "intersect(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                "on=personId" +
            ")";

        StreamExpression expression =
            Intersect.intersect(
                Search.search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                Search.search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                on("personId")
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void intersect_withTwoFields() {
        String expected =
            "intersect(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                "on=\"personId=ownerId\"" +
            ")";

        StreamExpression expression =
            Intersect.intersect(
                Search.search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                Search.search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc")),
                on("personId", "ownerId")
            );
        
        assertEquals(expected, expression.toString());
    }
}