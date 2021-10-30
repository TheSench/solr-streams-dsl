package com.github.TheSench.solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

import com.github.TheSench.solr.dsl.stream.expr.params.HashedClause;
import com.github.TheSench.solr.dsl.stream.expr.params.OnClause;

public class JoinStreams {
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#leftOuterJoin">Stream Decorator Reference: leftOuterJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("leftOuterJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#innerJoin">Stream Decorator Reference: innerJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression innerJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("innerJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#hashJoin">Stream Decorator Reference: hashJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression hashJoin(StreamExpression leftStream, HashedClause rightStream, OnClause onClause) {
        return new StreamExpression("hashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#outerHashJoin">Stream Decorator Reference: outerHashJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression outerHashJoin(StreamExpression leftStream, HashedClause rightStream, OnClause onClause) {
        return new StreamExpression("outerHashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    public static OnClause on(String fieldInBoth) {
        return new OnClause(fieldInBoth);
    }

    public static OnClause on(String fieldInLeft, String fieldInRight) {
        return new OnClause(fieldInLeft, fieldInRight);
    }

    public static HashedClause hashed(StreamExpression stream) {
        return new HashedClause(stream);
    }
}
