package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Eq {
    private Eq() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @param otherValues
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, FieldOrEvaluator secondValue, FieldOrEvaluator... otherValues) {
        StreamExpression eqExpression = new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(secondValue);
        
        for (FieldOrEvaluator value : otherValues) {
            eqExpression.addParameter(value);
        }

        return (BooleanEvaluator) eqExpression;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator fieldOrEvaluator, int value) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(fieldOrEvaluator)
            .withParameter(Integer.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator fieldOrEvaluator, double value) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(fieldOrEvaluator)
            .withParameter(Double.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param fieldOrEvaluator
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator fieldOrEvaluator, float value) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(fieldOrEvaluator)
            .withParameter(Float.toString(value));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static BooleanEvaluator eq(int value, FieldOrEvaluator fieldOrEvaluator) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(value))
            .withParameter(fieldOrEvaluator);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static BooleanEvaluator eq(double value, FieldOrEvaluator fieldOrEvaluator) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(value))
            .withParameter(fieldOrEvaluator);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param value
     * @param fieldOrEvaluator
     * @return
     */
    public static BooleanEvaluator eq(float value, FieldOrEvaluator fieldOrEvaluator) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(value))
            .withParameter(fieldOrEvaluator);
    }
}
