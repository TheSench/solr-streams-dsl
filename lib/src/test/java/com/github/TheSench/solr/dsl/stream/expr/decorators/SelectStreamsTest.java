package com.github.TheSench.solr.dsl.stream.expr.decorators;

import static com.github.TheSench.solr.dsl.stream.expr.decorators.SelectStreams.select;
import static com.github.TheSench.solr.dsl.stream.expr.params.FieldListClause.fl;
import static com.github.TheSench.solr.dsl.stream.expr.params.SortClause.sort;
import static com.github.TheSench.solr.dsl.stream.expr.sources.RequestHandler.EXPORT;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.q;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.qt;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SelectStreamsTest {
    
    @Test
    void selectTest() {
        String expected =
            "select(" +
                "search(collection1,fl=\"id,teamName_s,wins,losses\",q=\"*:*\",qt=\"/export\",sort=\"id asc\")," +
                "teamName_s as teamName," +
                "wins," +
                "losses," +
                "replace(wins,null,withValue=0)," +
                "replace(losses,null,withValue=0)," +
                "if(eq(0,wins),0,div(add(wins,losses),wins)) as winPercentage" +
            ")";
        
        StreamExpression expression =
            select(
                search("collection1", fl("id", "teamName_s", "wins", "losses"), q("*:*"), qt(EXPORT), sort("id asc")),
                "teamName_s as teamName",
                "wins",
                "losses",
                "replace(wins,null,withValue=0)",
                "replace(losses,null,withValue=0)",
                "if(eq(0,wins),0,div(add(wins,losses),wins)) as winPercentage"
            );

        assertEquals(expected, expression.toString());
    }
}
