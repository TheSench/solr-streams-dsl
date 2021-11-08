package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Add {
    private Add() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static NumericEvaluator add(FieldOrNumericEvaluator firstValue, FieldOrNumericEvaluator secondValue, FieldOrNumericEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumericEvaluator("add")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumericEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumericEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(FieldOrNumericEvaluator leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(FieldOrNumericEvaluator leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(FieldOrNumericEvaluator leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(FieldOrNumericEvaluator leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(int leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(int leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(int leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(int leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(double leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(double leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(double leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(double leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(float leftValue, int rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(float leftValue, double rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(float leftValue, float rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumericEvaluator add(float leftValue, FieldOrNumericEvaluator rightValue) {
        return (NumericEvaluator) new NumericEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
