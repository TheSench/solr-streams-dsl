package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Asin {
    private Asin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator asin(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param field
     * @return
     */
    public static NumberEvaluator asin(Field field) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator asin(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator asin(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator asin(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator asin(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#asin">Stream Evaluator Reference: asin</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator asin(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("asin").withParameter(numberEvaluator);
    }

}
