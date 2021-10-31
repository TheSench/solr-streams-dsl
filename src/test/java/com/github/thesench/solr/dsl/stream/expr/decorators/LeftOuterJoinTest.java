package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.leftOuterJoin;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.on;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.q;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

class LeftOuterJoinTest {
    @Test
    void leftOuterJoin_withOneField() {
        String expected =
            "leftOuterJoin(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                "on=personId" +
            ")";

        StreamExpression expression =
            leftOuterJoin(
                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                on("personId")
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void leftOuterJoin_withTwoFields() {
        String expected =
            "leftOuterJoin(" +
                "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                "on=\"personId=ownerId\"" +
            ")";

        StreamExpression expression =
            leftOuterJoin(
                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc")),
                on("personId", "ownerId")
            );
        
        assertEquals(expected, expression.toString());
    }
}