package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sin {
    private Sin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator sin(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param field
     * @return
     */
    public static NumericEvaluator sin(Field field) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sin(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sin(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sin(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sin(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator sin(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("sin").withParameter(numberEvaluator);
    }

}
