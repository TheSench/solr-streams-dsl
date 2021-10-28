package solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

import solr.dsl.stream.expr.params.OnClause;

public class JoinStreams {
    
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("leftOuterJoin")
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
}
