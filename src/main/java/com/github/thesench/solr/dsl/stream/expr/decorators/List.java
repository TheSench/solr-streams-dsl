package com.github.thesench.solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class List {
    private List() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#list">Stream Decorator Reference: list</a>
     * @param stream1
     * @param stream2
     * @return
     */
    public static StreamExpression list(StreamExpression stream1, StreamExpression stream2) {
        return new StreamExpression("list")
            .withParameter(stream1)
            .withParameter(stream2);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#list">Stream Decorator Reference: list</a>
     * @param streams
     * @return
     */
    public static StreamExpression list(StreamExpression... streams) {
        StreamExpression expression = new StreamExpression("list");
        for (StreamExpression stream : streams) {
            expression.addParameter(stream);
        }
        return expression;
    }

}
