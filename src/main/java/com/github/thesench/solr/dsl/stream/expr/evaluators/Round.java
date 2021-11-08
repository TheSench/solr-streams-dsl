package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Round {
    private Round() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator round(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param field
     * @return
     */
    public static NumberEvaluator round(Field field) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator round(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator round(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator round(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator round(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator round(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("round").withParameter(numberEvaluator);
    }

}
