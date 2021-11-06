package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class InnerJoin {
    private InnerJoin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#innerJoin">Stream Decorator Reference: innerJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression innerJoin(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("innerJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

}
