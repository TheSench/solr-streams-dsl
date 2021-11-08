package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sin {
    private Sin() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator sin(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param field
     * @return
     */
    public static NumberEvaluator sin(Field field) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sin(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sin(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sin(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sin(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sin">Stream Evaluator Reference: sin</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator sin(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("sin").withParameter(numberEvaluator);
    }

}
