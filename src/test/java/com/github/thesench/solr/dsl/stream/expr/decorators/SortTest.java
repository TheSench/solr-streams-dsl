package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.innerJoin;
import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.sort;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.by;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.on;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.q;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.StreamSources.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SortTest {
    
    @Test
    void sortTest() {
        String expected =
            "sort(" +
                "innerJoin(" +
                  "search(people,q=\"*:*\",qt=\"/export\",fl=\"id,name\",sort=\"id asc\")," +
                  "search(pets,q=\"type:dog\",qt=\"/export\",fl=\"owner,petName\",sort=\"owner asc\")," +
                  "on=\"id=owner\"" +
                ")," +
                "by=\"name asc,petName asc\"" +
            ")";
        
        StreamExpression expression =
            sort(
                innerJoin(
                    search("people", q("*:*"), qt(EXPORT), fl("id", "name"), sort("id asc")),
                    search("pets", q("type:dog"), qt(EXPORT), fl("owner", "petName"), sort("owner asc")),
                    on("id", "owner")
                ),
                by("name asc", "petName asc")
            );

        assertEquals(expected, expression.toString());
    }
}