package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cbrt {
    private Cbrt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator cbrt(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param field
     * @return
     */
    public static NumericEvaluator cbrt(Field field) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cbrt(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cbrt(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cbrt(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cbrt(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator cbrt(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("cbrt").withParameter(numberEvaluator);
    }

}
