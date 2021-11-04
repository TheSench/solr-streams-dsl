package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Add {
    private Add() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param firstField
     * @param secondField
     * @param otherFields
     * @return
     */
    public static NumberEvaluator add(FieldOrEvaluator firstField, FieldOrEvaluator secondField, FieldOrEvaluator... otherFields) {
        StreamExpression evaluatorExpression = new NumberEvaluator("add")
            .withParameter(firstField.toString())
            .withParameter(secondField.toString());

        for (FieldOrEvaluator field : otherFields) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (NumberEvaluator) evaluatorExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static NumberEvaluator add(FieldOrEvaluator fieldOrEvaluator, int value) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(fieldOrEvaluator)
            .withParameter(Integer.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static NumberEvaluator add(FieldOrEvaluator fieldOrEvaluator, double value) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(fieldOrEvaluator)
            .withParameter(Double.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static NumberEvaluator add(FieldOrEvaluator fieldOrEvaluator, float value) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(fieldOrEvaluator)
            .withParameter(Float.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static NumberEvaluator add(int value, FieldOrEvaluator fieldOrEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Integer.toString(value))
            .withParameter(fieldOrEvaluator);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static NumberEvaluator add(double value, FieldOrEvaluator fieldOrEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Double.toString(value))
            .withParameter(fieldOrEvaluator);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#add">Stream Evaluator Reference: add</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static NumberEvaluator add(float value, FieldOrEvaluator fieldOrEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("add")
            .withParameter(Float.toString(value))
            .withParameter(fieldOrEvaluator);
    }
}
