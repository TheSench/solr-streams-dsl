package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Abs {
    private Abs() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator abs(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param field
     * @return
     */
    public static NumericEvaluator abs(Field field) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator abs(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator abs(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator abs(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator abs(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator abs(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("abs").withParameter(numberEvaluator);
    }

}
