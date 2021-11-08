package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Tanh {
    private Tanh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator tanh(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param field
     * @return
     */
    public static NumberEvaluator tanh(Field field) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tanh(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tanh(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tanh(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tanh(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator tanh(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("tanh").withParameter(numberEvaluator);
    }

}
