package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Ceil {
    private Ceil() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator ceil(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param field
     * @return
     */
    public static NumberEvaluator ceil(Field field) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator ceil(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator ceil(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator ceil(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator ceil(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#ceil">Stream Evaluator Reference: ceil</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator ceil(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("ceil").withParameter(numberEvaluator);
    }

}
