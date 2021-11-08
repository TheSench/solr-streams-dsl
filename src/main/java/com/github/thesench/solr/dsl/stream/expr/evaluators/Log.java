package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Log {
    private Log() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param fieldName
     * @return
     */
    public static NumberEvaluator log(String fieldName) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param field
     * @return
     */
    public static NumberEvaluator log(Field field) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator log(int rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator log(long rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator log(double rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumberEvaluator log(float rawNumber) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param numberEvaluator
     * @return
     */
    public static NumberEvaluator log(NumberEvaluator numberEvaluator) {
        return (NumberEvaluator) new NumberEvaluator("log").withParameter(numberEvaluator);
    }

}
