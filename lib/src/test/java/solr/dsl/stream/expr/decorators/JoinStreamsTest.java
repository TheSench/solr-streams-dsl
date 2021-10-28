package solr.dsl.stream.expr.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static solr.dsl.stream.expr.decorators.JoinStreams.innerJoin;
import static solr.dsl.stream.expr.decorators.JoinStreams.leftOuterJoin;
import static solr.dsl.stream.expr.decorators.JoinStreams.on;
import static solr.dsl.stream.expr.sources.RequestHandler.EXPORT;
import static solr.dsl.stream.expr.sources.SearchStreams.fl;
import static solr.dsl.stream.expr.sources.SearchStreams.q;
import static solr.dsl.stream.expr.sources.SearchStreams.qt;
import static solr.dsl.stream.expr.sources.SearchStreams.search;
import static solr.dsl.stream.expr.sources.SearchStreams.sort;

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
            String expected =   "leftOuterJoin(" +
                                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                                    "on=personId" +
                                ")";

            StreamExpression expression = leftOuterJoin(
                                                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                                                search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                                                on("personId")
                                            );
            
            assertEquals(expected, expression.toString());
        }

        @Test
        void leftOuterJoin_withTwoFields() {
            String expected =   "leftOuterJoin(" +
                                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                                    "on=\"personId=ownerId\"" +
                                ")";

            StreamExpression expression = leftOuterJoin(
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
            String expected =   "innerJoin(" +
                                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"personId,petName\",sort=\"personId asc\")," +
                                    "on=personId" +
                                ")";

            StreamExpression expression = innerJoin(
                                                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                                                search("pets", q("type:cat"), qt(EXPORT), fl("personId,petName"), sort("personId asc")),
                                                on("personId")
                                            );
            
            assertEquals(expected, expression.toString());
        }

        @Test
        void innerJoin_withTwoFields() {
            String expected =   "innerJoin(" +
                                    "search(people,q=\"*:*\",qt=\"/export\",fl=\"personId,name\",sort=\"personId asc\")," +
                                    "search(pets,q=\"type:cat\",qt=\"/export\",fl=\"ownerId,petName\",sort=\"ownerId asc\")," +
                                    "on=\"personId=ownerId\"" +
                                ")";

            StreamExpression expression = innerJoin(
                                                search("people", q("*:*"), qt(EXPORT), fl("personId,name"), sort("personId asc")),
                                                search("pets", q("type:cat"), qt(EXPORT), fl("ownerId,petName"), sort("ownerId asc")),
                                                on("personId", "ownerId")
                                            );
            
            assertEquals(expected, expression.toString());
        }
    }
}
