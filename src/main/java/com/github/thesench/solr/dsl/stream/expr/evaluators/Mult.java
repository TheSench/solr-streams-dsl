package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

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
    public static NumberEvaluator mult(FieldOrNumberEvaluator firstValue, FieldOrNumberEvaluator secondValue, FieldOrNumberEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumberEvaluator("mult")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumberEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumberEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(FieldOrNumberEvaluator leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(FieldOrNumberEvaluator leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(FieldOrNumberEvaluator leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(FieldOrNumberEvaluator leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(int leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(int leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(int leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(int leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(double leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(double leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(double leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(double leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(float leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(float leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(float leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mult">Stream Evaluator Reference: mult</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator mult(float leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("mult")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
