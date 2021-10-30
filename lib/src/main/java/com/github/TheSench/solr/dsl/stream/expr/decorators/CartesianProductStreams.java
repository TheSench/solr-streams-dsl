package com.github.TheSench.solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

import com.github.TheSench.solr.dsl.stream.expr.evaluators.EvaluatorStreamExpression;
import com.github.TheSench.solr.dsl.stream.expr.sources.SortFields;

public class CartesianProductStreams {
    private CartesianProductStreams() {}
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param fieldName
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param fieldName
     * @param productSort
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, StreamExpressionProductSortParameter productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(productSort);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param evaluator
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param evaluator
     * @param productSort
     * @return
     */
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
