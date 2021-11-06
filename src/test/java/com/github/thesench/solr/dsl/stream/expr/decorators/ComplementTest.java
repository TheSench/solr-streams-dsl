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

class ComplementTest {
    @Test
    void complement_withOneField() {
        String expected =
            "complement(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                "on=personId" +
            ")";

        StreamExpression expression =
            Complement.complement(
                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                on("personId")
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void complement_withTwoFields() {
        String expected =
            "complement(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                "on=\"personId=ownerId\"" +
            ")";

        StreamExpression expression =
            Complement.complement(
                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc")),
                on("personId", "ownerId")
            );
        
        assertEquals(expected, expression.toString());
    }
}