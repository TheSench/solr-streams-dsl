package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Cosh {
    private Cosh() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator cosh(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param field
     * @return
     */
    public static NumericEvaluator cosh(Field field) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cosh(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cosh(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cosh(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator cosh(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#cosh">Stream Evaluator Reference: cosh</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator cosh(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("cosh").withParameter(numberEvaluator);
    }

}
