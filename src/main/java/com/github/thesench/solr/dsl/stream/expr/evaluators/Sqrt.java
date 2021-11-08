package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sqrt {
    private Sqrt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator sqrt(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param field
     * @return
     */
    public static NumberEvaluator sqrt(Field field) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sqrt(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sqrt(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sqrt(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sqrt(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sqrt">Stream Evaluator Reference: sqrt</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator sqrt(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("sqrt").withParameter(numberEvaluator);
    }

}
