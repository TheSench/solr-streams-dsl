package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Tan {
    private Tan() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator tan(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param field
     * @return
     */
    public static NumericEvaluator tan(Field field) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tan(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tan(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tan(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator tan(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator tan(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("tan").withParameter(numberEvaluator);
    }

}
