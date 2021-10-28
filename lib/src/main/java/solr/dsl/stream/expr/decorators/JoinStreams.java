package solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

import solr.dsl.stream.expr.params.HashedClause;
import solr.dsl.stream.expr.params.OnClause;

public class JoinStreams {
    
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("leftOuterJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    public static StreamExpression innerJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("innerJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    public static StreamExpression hashJoin(StreamExpression leftStream, HashedClause rightStream, OnClause onClause) {
        return new StreamExpression("hashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
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
