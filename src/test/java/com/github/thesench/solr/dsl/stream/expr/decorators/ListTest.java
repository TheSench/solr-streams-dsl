package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.StreamSources.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class ListTest {
    @Test
    void list_whenGivenTwoStreams_producesCorrectStream() {
        String expected =
            "list(search(collection1,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\")," +
                "search(collection2,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\"))";
        
        StreamExpression expression =
        List.list(search("collection1", q("*:*"), fl("id", "prod_ss"), sort("id asc")),
            search("collection2", q("*:*"), fl("id", "prod_ss"), sort("id asc")));
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void list_whenGivenMoreThanTwoStreams_producesCorrectStream() {
        String expected =
            "list(search(collection1,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\")," +
                "search(collection2,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\")," +
                "search(collection3,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\")," +
                "search(collection4,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\")," +
                "search(collection5,q=\"*:*\",fl=\"id,prod_ss\",sort=\"id asc\"))";
        
        StreamExpression expression =
        List.list(search("collection1", q("*:*"), fl("id", "prod_ss"), sort("id asc")),
            search("collection2", q("*:*"), fl("id", "prod_ss"), sort("id asc")),
            search("collection3", q("*:*"), fl("id", "prod_ss"), sort("id asc")),
            search("collection4", q("*:*"), fl("id", "prod_ss"), sort("id asc")),
            search("collection5", q("*:*"), fl("id", "prod_ss"), sort("id asc")));
        
        assertEquals(expected, expression.toString());
    }
}
