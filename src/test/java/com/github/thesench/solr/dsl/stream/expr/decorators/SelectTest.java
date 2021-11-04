package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.select;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Add.add;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Div.div;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Eq.eq;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.If.if_;
import static com.github.thesench.solr.dsl.stream.expr.params.Replace.replace;
import static com.github.thesench.solr.dsl.stream.expr.params.Replace.WithValue.withValue;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.q;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.StreamSources.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SelectTest {
    
    @Test
    void select_whenGivenStrings_returnsSelectStream() {
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
    
    @Test
    void select_whenGivenFieldsOrAliases_returnsSelectStream() {
        Field teamName_s = new Field("teamName_s");
        Field wins = new Field("wins");
        Field losses = new Field("losses");
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
                teamName_s.as("teamName"),
                wins,
                losses,
                replace(wins, null, withValue(0)),
                replace(losses, null, withValue(0)),
                if_(
                    eq(0, wins),
                    0,
                    div(add(wins, losses), wins)
                ).as("winPercentage")
            );

        assertEquals(expected, expression.toString());
    }
}
