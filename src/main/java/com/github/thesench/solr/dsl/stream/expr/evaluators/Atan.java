package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Atan {
    private Atan() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator atan(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param field
     * @return
     */
    public static NumberEvaluator atan(Field field) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator atan(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator atan(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator atan(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator atan(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#atan">Stream Evaluator Reference: atan</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator atan(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("atan").withParameter(numberEvaluator);
    }

}
