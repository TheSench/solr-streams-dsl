package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Sub {
    private Sub() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static NumberEvaluator sub(FieldOrNumberEvaluator firstValue, FieldOrNumberEvaluator secondValue, FieldOrNumberEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumberEvaluator("sub")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumberEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumberEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(FieldOrNumberEvaluator leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(FieldOrNumberEvaluator leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(FieldOrNumberEvaluator leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(FieldOrNumberEvaluator leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(int leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(int leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(int leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(int leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(double leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(double leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(double leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(double leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(float leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(float leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(float leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator sub(float leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
