package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

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
    public static NumericEvaluator sub(FieldOrNumericEvaluator firstValue, FieldOrNumericEvaluator secondValue, FieldOrNumericEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumericEvaluator("sub")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumericEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumericEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(FieldOrNumericEvaluator leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(FieldOrNumericEvaluator leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(FieldOrNumericEvaluator leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(FieldOrNumericEvaluator leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(int leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(int leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(int leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(int leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(double leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(double leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(double leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(double leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(float leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(float leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(float leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sub">Stream Evaluator Reference: sub</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator sub(float leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("sub")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
