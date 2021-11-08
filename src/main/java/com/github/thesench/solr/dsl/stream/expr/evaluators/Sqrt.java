package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sqrt {
    private Sqrt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator sqrt(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param field
     * @return
     */
    public static NumericEvaluator sqrt(Field field) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sqrt(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sqrt(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sqrt(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator sqrt(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator sqrt(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("sqrt").withParameter(numberEvaluator);
    }

}
