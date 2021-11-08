package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Sinh {
    private Sinh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator sinh(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param field
     * @return
     */
    public static NumberEvaluator sinh(Field field) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sinh(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sinh(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sinh(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator sinh(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#sinh">Stream Evaluator Reference: sinh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator sinh(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("sinh").withParameter(numberEvaluator);
    }

}
