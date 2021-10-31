package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.JoinStreams.hashJoin;
import static com.github.thesench.solr.dsl.stream.expr.decorators.JoinStreams.hashed;
import static com.github.thesench.solr.dsl.stream.expr.decorators.JoinStreams.innerJoin;
import static com.github.thesench.solr.dsl.stream.expr.decorators.JoinStreams.leftOuterJoin;
import static com.github.thesench.solr.dsl.stream.expr.decorators.JoinStreams.outerHashJoin;
import static com.github.thesench.solr.dsl.stream.expr.params.FieldListClause.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.OnClause.on;
import static com.github.thesench.solr.dsl.stream.expr.params.SortClause.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.q;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.qt;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JoinStreamsTest {
    @Test
    void makeVsCodeRecognizeNestedTests() {
        assertTrue(true, "VSCode skips files with no top-level @Tests.  This ensures that it reads this file, so it then sees the @Nested inner classes");
    }

    @Nested
    static class leftOuterJoinTest {
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

    @Nested
    static class innerJoinTest {
        @Test
        void innerJoin_withOneField() {
            String expected =
                "innerJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                    "on=personId" +
                ")";

            StreamExpression expression =
                innerJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                    on("personId")
                );
            
            assertEquals(expected, expression.toString());
        }

        @Test
        void innerJoin_withTwoFields() {
            String expected =
                "innerJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                    "on=\"personId=ownerId\"" +
                ")";

            StreamExpression expression =
                innerJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc")),
                    on("personId", "ownerId")
                );
            
            assertEquals(expected, expression.toString());
        }
    }

    @Nested
    static class hashJoinTest {
        @Test
        void hashJoin_withOneField() {
            String expected =
                "hashJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "hashed=search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                    "on=personId" +
                ")";

            StreamExpression expression =
                hashJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    hashed(search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc"))),
                    on("personId")
                );
            
            assertEquals(expected, expression.toString());
        }

        @Test
        void hashJoin_withTwoFields() {
            String expected =
                "hashJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "hashed=search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                    "on=\"personId=ownerId\"" +
                ")";

            StreamExpression expression =
                hashJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    hashed(search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc"))),
                    on("personId", "ownerId")
                );
            
            assertEquals(expected, expression.toString());
        }
    }

    @Nested
    static class outerHashJoinTest {
        @Test
        void leftOuterJoin_withOneField() {
            String expected =
                "outerHashJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "hashed=search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                    "on=personId" +
                ")";

            StreamExpression expression =
                outerHashJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    hashed(search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc"))),
                    on("personId")
                );
            
            assertEquals(expected, expression.toString());
        }

        @Test
        void outerHashJoin_withTwoFields() {
            String expected =
                "outerHashJoin(" +
                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                    "hashed=search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                    "on=\"personId=ownerId\"" +
                ")";

            StreamExpression expression =
                outerHashJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                    hashed(search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc"))),
                    on("personId", "ownerId")
                );
            
            assertEquals(expected, expression.toString());
        }
    }
}
