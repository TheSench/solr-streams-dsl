package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Tanh {
    private Tanh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator tanh(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param field
     * @return
     */
    public static NumericEvaluator tanh(Field field) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tanh(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tanh(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tanh(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tanh(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tanh">Stream Evaluator Reference: tanh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator tanh(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("tanh").withParameter(numberEvaluator);
    }

}
