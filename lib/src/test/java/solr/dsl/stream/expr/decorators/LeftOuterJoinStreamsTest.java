package solr.dsl.stream.expr.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static solr.dsl.stream.expr.decorators.LeftOuterJoinStreams.leftOuterJoin;
import static solr.dsl.stream.expr.params.OnClause.on;
import static solr.dsl.stream.expr.sources.SearchStreams.search;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class LeftOuterJoinStreamsTest {
    @Test
    void leftOuterJoin_withOneField() {
        StreamExpression expression = leftOuterJoin(
                                            search("testCollection1"),
                                            search("testCollection2"),
                                            on("someField")
                                        );
        
        String expected =   "leftOuterJoin(" +
                                "search(testCollection1)," +
                                "search(testCollection2)," +
                                "on=someField" +
                            ")";
        assertEquals(expected, expression.toString());
    }

    @Test
    void leftOuterJoin_withTwoFields() {
        StreamExpression expression = leftOuterJoin(
                                            search("testCollection1"),
                                            search("testCollection2"),
                                            on("someField", "someOtherField")
                                        );
        
        String expected =   "leftOuterJoin(" +
                                "search(testCollection1)," +
                                "search(testCollection2)," +
                                "on=\"someField=someOtherField\"" +
                            ")";
        assertEquals(expected, expression.toString());
    }
}
