package solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

import solr.dsl.stream.expr.evaluators.EvaluatorStreamExpression;
import solr.dsl.stream.expr.sources.SortField;

public class CartesianProductStreams {
    private CartesianProductStreams() {}
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName);
    }
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, SortField sortField) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(new StreamExpressionNamedParameter(CommonParams.SORT, sortField.toString()));
    }
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, String sorts) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(new StreamExpressionNamedParameter(CommonParams.SORT, sorts));
    }
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator);
    }
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator, SortField sortField) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator)
            .withParameter(new StreamExpressionNamedParameter(CommonParams.SORT, sortField.toString()));
    }
    
    public StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator, String sorts) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator)
            .withParameter(new StreamExpressionNamedParameter(CommonParams.SORT, sorts));
    }
}
