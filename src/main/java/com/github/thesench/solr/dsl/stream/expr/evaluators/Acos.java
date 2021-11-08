package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Acos {
    private Acos() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator acos(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param field
     * @return
     */
    public static NumberEvaluator acos(Field field) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator acos(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator acos(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator acos(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator acos(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#acos">Stream Evaluator Reference: acos</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator acos(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("acos").withParameter(numberEvaluator);
    }

}
