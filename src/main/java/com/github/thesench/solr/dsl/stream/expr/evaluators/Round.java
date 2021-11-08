package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Round {
    private Round() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator round(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param field
     * @return
     */
    public static NumericEvaluator round(Field field) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator round(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator round(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator round(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator round(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#round">Stream Evaluator Reference: round</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator round(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("round").withParameter(numberEvaluator);
    }

}
