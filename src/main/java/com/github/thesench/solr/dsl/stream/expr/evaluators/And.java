package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class And {
    private And() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#and">Stream Evaluator Reference: and</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static BooleanEvaluator and(FieldOrBooleanEvaluator firstValue, FieldOrBooleanEvaluator secondValue, FieldOrBooleanEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new BooleanEvaluator("and")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

            for (FieldOrBooleanEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (BooleanEvaluator) evaluatorExpression;
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#and">Stream Evaluator Reference: and</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator and(FieldOrBooleanEvaluator leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("and")
            .withParameter(leftValue)
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#and">Stream Evaluator Reference: and</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator and(FieldOrBooleanEvaluator leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("and")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#and">Stream Evaluator Reference: and</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator and(boolean leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("and")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#and">Stream Evaluator Reference: and</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator and(boolean leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("and")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(rightValue);
    }
}
