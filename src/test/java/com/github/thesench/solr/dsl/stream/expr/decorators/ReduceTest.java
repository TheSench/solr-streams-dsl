package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.reduce;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.By.by;
import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.Reducer.group;
import static com.github.thesench.solr.dsl.stream.expr.params.N.n;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.QT.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.sources.Search;

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
                Search.search("collection1", q("*:*"), qt(EXPORT), fl("id", "a_s", "a_i", "a_f"), sort("a_s asc", "a_f asc")),
                by("a_s"),
                group(sort("a_f desc"), n(4))
            );

        assertEquals(expected, expression.toString());
    }
}
