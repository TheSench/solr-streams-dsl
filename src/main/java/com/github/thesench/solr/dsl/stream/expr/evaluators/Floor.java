package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Floor {
    private Floor() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator floor(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param field
     * @return
     */
    public static NumberEvaluator floor(Field field) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator floor(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator floor(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator floor(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator floor(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#floor">Stream Evaluator Reference: floor</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator floor(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("floor").withParameter(numberEvaluator);
    }

}
