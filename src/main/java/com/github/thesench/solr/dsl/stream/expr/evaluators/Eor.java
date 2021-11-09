package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Eor {
    private Eor() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eor">Stream Evaluator Reference: eor</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static BooleanEvaluator eor(FieldOrBooleanEvaluator firstValue, FieldOrBooleanEvaluator secondValue, FieldOrBooleanEvaluator... otherValues) {
        StreamExpression evaluatorExpression = new BooleanEvaluator("eor")
            .withParameter(firstValue.toString())
            .withParameter(secondValue.toString());

            for (FieldOrBooleanEvaluator field : otherValues) {
            evaluatorExpression.addParameter(field.toString());
        }

        return (BooleanEvaluator) evaluatorExpression;
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eor">Stream Evaluator Reference: eor</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator eor(FieldOrBooleanEvaluator leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eor")
            .withParameter(leftValue)
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eor">Stream Evaluator Reference: eor</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator eor(FieldOrBooleanEvaluator leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eor")
            .withParameter(leftValue)
            .withParameter(rightValue);
    }
    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eor">Stream Evaluator Reference: eor</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator eor(boolean leftValue, boolean rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eor")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(Boolean.toString(rightValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eor">Stream Evaluator Reference: eor</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator eor(boolean leftValue, FieldOrBooleanEvaluator rightValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eor")
            .withParameter(Boolean.toString(leftValue))
            .withParameter(rightValue);
    }
}
