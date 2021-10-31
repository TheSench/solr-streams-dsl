package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.reduce;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.by;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.group;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.n;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.q;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class ReduceTest {
    @Test
    void reduceTest() {
        String expected =
            "reduce(" +
                "search(collection1,q=\"*:*\",qt=\"/export\",fl=\"id,a_s,a_i,a_f\",sort=\"a_s asc,a_f asc\")," +
                "by=a_s," +
                "group(sort=\"a_f desc\",n=4)" +
            ")";

        StreamExpression expression =
            reduce(
                search("collection1", q("*:*"), qt(EXPORT), fl("id", "a_s", "a_i", "a_f"), sort("a_s asc", "a_f asc")),
                by("a_s"),
                group(sort("a_f desc"), n(4))
            );

        assertEquals(expected, expression.toString());
    }
}
