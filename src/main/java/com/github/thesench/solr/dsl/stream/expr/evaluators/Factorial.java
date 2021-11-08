package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Factorial {
    private Factorial() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator factorial(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param field
     * @return
     */
    public static NumberEvaluator factorial(Field field) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator factorial(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator factorial(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator factorial(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator factorial(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#factorial">Stream Evaluator Reference: factorial</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator factorial(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("factorial").withParameter(numberEvaluator);
    }

}
