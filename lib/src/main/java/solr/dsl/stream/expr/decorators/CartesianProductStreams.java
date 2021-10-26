package solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

import solr.dsl.stream.expr.evaluators.EvaluatorStreamExpression;
import solr.dsl.stream.expr.sources.SortFields;

public class CartesianProductStreams {
    private CartesianProductStreams() {}
    
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName);
    }
    
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, StreamExpressionProductSortParameter productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(productSort);
    }
    
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator);
    }
    
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator, StreamExpressionProductSortParameter productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator)
            .withParameter(productSort);
    }

    public static StreamExpressionProductSortParameter productSort(SortFields sortFields) {
        return new StreamExpressionProductSortParameter(sortFields.toString());
    }

    public static StreamExpressionProductSortParameter productSort(String sorts) {
        return new StreamExpressionProductSortParameter(sorts);
    }

    public static class StreamExpressionProductSortParameter extends StreamExpressionNamedParameter {
        public StreamExpressionProductSortParameter(String sorts) {
            super("productSort", sorts);
        }
    }
}
