package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Tan {
    private Tan() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator tan(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param field
     * @return
     */
    public static NumberEvaluator tan(Field field) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tan(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tan(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tan(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator tan(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#tan">Stream Evaluator Reference: tan</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator tan(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("tan").withParameter(numberEvaluator);
    }

}
