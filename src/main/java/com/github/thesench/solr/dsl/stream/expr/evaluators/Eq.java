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
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, FieldOrEvaluator secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, int secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(Integer.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, double secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, float secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(FieldOrEvaluator firstValue, boolean secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(firstValue)
            .withParameter(Boolean.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(int firstValue, FieldOrEvaluator secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(int firstValue, int secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(int firstValue, double secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(int firstValue, float secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(int firstValue, boolean secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Boolean.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(double firstValue, FieldOrEvaluator secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(double firstValue, int secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(double firstValue, double secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(double firstValue, float secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(double firstValue, boolean secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Double.toString(firstValue))
            .withParameter(Boolean.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(float firstValue, FieldOrEvaluator secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(float firstValue, int secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(float firstValue, double secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(float firstValue, float secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(float firstValue, boolean secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Float.toString(firstValue))
            .withParameter(Boolean.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(boolean firstValue, FieldOrEvaluator secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Boolean.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param value
     * @return
     */
    public static BooleanEvaluator eq(boolean firstValue, int secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Boolean.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(boolean firstValue, double secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Boolean.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(boolean firstValue, float secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Boolean.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#eq">Stream Evaluator Reference: eq</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static BooleanEvaluator eq(boolean firstValue, boolean secondValue) {
        return (BooleanEvaluator) new BooleanEvaluator("eq")
            .withParameter(Boolean.toString(firstValue))
            .withParameter(Boolean.toString(secondValue));
    }
}
