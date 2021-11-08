package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Atan {
    private Atan() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator atan(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param field
     * @return
     */
    public static NumericEvaluator atan(Field field) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator atan(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator atan(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator atan(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator atan(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator atan(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("atan").withParameter(numberEvaluator);
    }

}
