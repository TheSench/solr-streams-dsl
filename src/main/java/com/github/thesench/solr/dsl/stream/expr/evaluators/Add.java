package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

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
    public static NumberEvaluator add(FieldOrNumberEvaluator firstValue, FieldOrNumberEvaluator secondValue, FieldOrNumberEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new NumberEvaluator("add")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

        for (FieldOrNumberEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumberEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(FieldOrNumberEvaluator leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(FieldOrNumberEvaluator leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(FieldOrNumberEvaluator leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(leftValue)
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(FieldOrNumberEvaluator leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(int leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(int leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
        .withParameter(Integer.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(int leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(int leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Integer.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(double leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(double leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
        .withParameter(Double.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(double leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(double leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Double.toString(leftValue))
            .withParameter(rightValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(float leftValue, int rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(Integer.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(float leftValue, double rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
        .withParameter(Float.toString(leftValue))
            .withParameter(Double.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(float leftValue, float rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(Float.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static NumberEvaluator add(float leftValue, FieldOrNumberEvaluator rightValue) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Float.toString(leftValue))
            .withParameter(rightValue);
    }
}
