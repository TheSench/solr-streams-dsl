package solr.dsl.stream.expr.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import org.junit.jupiter.api.Test;

public class JoinStreamsTest {
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
