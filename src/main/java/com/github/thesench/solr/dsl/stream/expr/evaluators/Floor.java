package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Floor {
    private Floor() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator floor(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param field
     * @return
     */
    public static NumericEvaluator floor(Field field) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator floor(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator floor(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator floor(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator floor(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator floor(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("floor").withParameter(numberEvaluator);
    }

}
