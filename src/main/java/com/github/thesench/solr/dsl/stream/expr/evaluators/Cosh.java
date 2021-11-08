package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cosh {
    private Cosh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator cosh(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param field
     * @return
     */
    public static NumberEvaluator cosh(Field field) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cosh(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cosh(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cosh(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator cosh(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator cosh(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("cosh").withParameter(numberEvaluator);
    }

}
