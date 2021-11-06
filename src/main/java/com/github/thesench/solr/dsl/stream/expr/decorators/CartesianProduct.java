package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.evaluators.Evaluator;
import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.ProductSort;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class CartesianProduct {
    private CartesianProduct() {}

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
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, ProductSort productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(productSort);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param field
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, Field field) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param field
     * @param productSort
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, Field field, ProductSort productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(field.toString())
            .withParameter(productSort);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param evaluator
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, Evaluator evaluator) {
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
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, Evaluator evaluator, ProductSort productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator)
            .withParameter(productSort);
    }
    
}
