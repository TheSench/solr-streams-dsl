package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.Hashed;
import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class HashJoin {
    private HashJoin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#hashJoin">Stream Decorator Reference: hashJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression hashJoin(StreamExpression leftStream, Hashed rightStream, On onClause) {
        return new StreamExpression("hashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

}
