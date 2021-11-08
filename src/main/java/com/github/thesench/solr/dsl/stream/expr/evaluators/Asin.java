package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Asin {
    private Asin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator asin(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param field
     * @return
     */
    public static NumericEvaluator asin(Field field) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator asin(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator asin(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator asin(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator asin(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator asin(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("asin").withParameter(numberEvaluator);
    }

}
