package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.BatchSize;
import com.github.thesench.solr.dsl.stream.expr.params.FL;
import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Fetch {
    private Fetch() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#fetch">Stream Decorator Reference: fetch</a>
     * @param collection
     * @param stream
     * @param fl
     * @param on
     * @return
     */
    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#fetch">Stream Decorator Reference: fetch</a>
     * @param collection
     * @param stream
     * @param fl
     * @param on
     * @param batchSize
     * @return
     */
    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on, BatchSize batchSize) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on)
            .withParameter(batchSize);
    }

}
