package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.By;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Sort {
    private Sort() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#sort">Stream Decorator Reference: sort</a>
     * @param stream
     * @param by
     * @return
     */
    public static StreamExpression sort(StreamExpression stream, By by) {
        return new StreamExpression("sort")
            .withParameter(stream)
            .withParameter(by);
    }

}
