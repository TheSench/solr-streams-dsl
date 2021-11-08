package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sinh {
    private Sinh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator sinh(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param field
     * @return
     */
    public static NumericEvaluator sinh(Field field) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sinh(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sinh(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sinh(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sinh(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator sinh(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("sinh").withParameter(numberEvaluator);
    }

}
