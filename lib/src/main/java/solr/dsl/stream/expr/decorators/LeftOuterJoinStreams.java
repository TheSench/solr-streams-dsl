package solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

import solr.dsl.stream.expr.params.OnClause;

public class LeftOuterJoinStreams {
    
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, OnClause onClause) {
        return new StreamExpression("leftOuterJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
}
