package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Intersect {
    private Intersect() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#intersect">Stream Decorator Reference: intersect</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression intersect(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("intersect")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

}
