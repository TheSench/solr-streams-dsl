package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Or {
    private Or() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#or">Stream Evaluator Reference: or</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static BooleanEvaluator or(FieldOrBooleanEvaluator firstValue, FieldOrBooleanEvaluator secondValue, FieldOrBooleanEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new BooleanEvaluator("or")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

            for (FieldOrBooleanEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (BooleanEvaluator) evaluatorExpression;
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#or">Stream Evaluator Reference: or</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator or(FieldOrBooleanEvaluator leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("or")
            .withParameter(leftValue)
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#or">Stream Evaluator Reference: or</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator or(FieldOrBooleanEvaluator leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("or")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#or">Stream Evaluator Reference: or</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator or(boolean leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("or")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#or">Stream Evaluator Reference: or</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator or(boolean leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("or")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(rightValue);
    }
}
