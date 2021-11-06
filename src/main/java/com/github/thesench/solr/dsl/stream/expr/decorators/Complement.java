package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Complement {
    private Complement() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#complement">Stream Decorator Reference: complement</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression complement(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("complement")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

}
