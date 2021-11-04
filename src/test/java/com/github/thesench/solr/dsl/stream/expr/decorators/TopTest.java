package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.top;
import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.N.n;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.QT.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static com.github.thesench.solr.dsl.stream.expr.sources.StreamSources.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class TopTest {
    
    @Test
    void topTest() {
        String expected =
            "top(n=3," +
                "search(collection1," +
                    "q=\"*:*\"," +
                    "qt=\"/export\"," +
                    "fl=\"id,a_s,a_i,a_f\"," +
                    "sort=\"a_f desc,a_i desc\")," +
                "sort=\"a_f asc,a_i asc\")";
        
        StreamExpression expression =
            top(n(3),
                search("collection1",
                    q("*:*"),
                    qt(EXPORT),
                    fl("id", "a_s", "a_i", "a_f"),
                    sort("a_f desc", "a_i desc")),
                sort("a_f asc", "a_i asc"));

        assertEquals(expected, expression.toString());
    }
}
