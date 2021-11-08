package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Mult {
    private Mult() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static NumericEvaluator mult(FieldOrNumericEvaluator firstValue, FieldOrNumericEvaluator secondValue, FieldOrNumericEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumericEvaluator("mult")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumericEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumericEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(FieldOrNumericEvaluator leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(FieldOrNumericEvaluator leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(FieldOrNumericEvaluator leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(FieldOrNumericEvaluator leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(int leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(int leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(int leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(int leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(double leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(double leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(double leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(double leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(float leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(float leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(float leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator mult(float leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
