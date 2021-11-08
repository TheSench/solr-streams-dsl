package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Abs {
    private Abs() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator abs(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param field
     * @return
     */
    public static NumberEvaluator abs(Field field) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator abs(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator abs(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator abs(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator abs(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#abs">Stream Evaluator Reference: abs</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator abs(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("abs").withParameter(numberEvaluator);
    }

}
