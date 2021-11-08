package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cbrt {
    private Cbrt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator cbrt(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param field
     * @return
     */
    public static NumberEvaluator cbrt(Field field) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cbrt(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cbrt(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cbrt(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cbrt(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cbrt">Stream Evaluator Reference: cbrt</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator cbrt(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("cbrt").withParameter(numberEvaluator);
    }

}
