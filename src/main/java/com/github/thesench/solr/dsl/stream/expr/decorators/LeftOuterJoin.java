package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class LeftOuterJoin {
    private LeftOuterJoin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#leftOuterJoin">Stream Decorator Reference: leftOuterJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("leftOuterJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

}
