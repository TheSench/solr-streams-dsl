package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cos {
    private Cos() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator cos(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param field
     * @return
     */
    public static NumberEvaluator cos(Field field) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cos(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cos(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cos(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cos(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator cos(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("cos").withParameter(numberEvaluator);
    }

}
