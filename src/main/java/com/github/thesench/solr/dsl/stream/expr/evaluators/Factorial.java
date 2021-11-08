package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Factorial {
    private Factorial() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator factorial(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param field
     * @return
     */
    public static NumericEvaluator factorial(Field field) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator factorial(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator factorial(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator factorial(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator factorial(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator factorial(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("factorial").withParameter(numberEvaluator);
    }

}
