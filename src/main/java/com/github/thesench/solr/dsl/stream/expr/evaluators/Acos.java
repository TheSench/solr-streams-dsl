package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Acos {
    private Acos() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator acos(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param field
     * @return
     */
    public static NumericEvaluator acos(Field field) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator acos(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator acos(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator acos(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator acos(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator acos(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("acos").withParameter(numberEvaluator);
    }

}
