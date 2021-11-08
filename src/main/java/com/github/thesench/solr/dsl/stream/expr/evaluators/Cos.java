package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cos {
    private Cos() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator cos(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param field
     * @return
     */
    public static NumericEvaluator cos(Field field) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cos(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cos(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cos(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cos(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cos">Stream Evaluator Reference: cos</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator cos(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("cos").withParameter(numberEvaluator);
    }

}
