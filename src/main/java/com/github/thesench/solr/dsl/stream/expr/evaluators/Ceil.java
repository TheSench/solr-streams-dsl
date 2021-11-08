package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Ceil {
    private Ceil() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator ceil(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param field
     * @return
     */
    public static NumericEvaluator ceil(Field field) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator ceil(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator ceil(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator ceil(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator ceil(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator ceil(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("ceil").withParameter(numberEvaluator);
    }

}
