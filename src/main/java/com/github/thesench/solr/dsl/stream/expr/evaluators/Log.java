package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Log {
    private Log() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param fieldName
     * @return
     */
    public static NumericEvaluator log(String fieldName) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(fieldName);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param field
     * @return
     */
    public static NumericEvaluator log(Field field) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(field.toString());
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator log(int rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(Integer.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator log(long rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(Long.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator log(double rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(Double.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param rawNumber
     * @return
     */
    public static NumericEvaluator log(float rawNumber) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(Float.toString(rawNumber));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#log">Stream Evaluator Reference: log</a>
     * @param numberEvaluator
     * @return
     */
    public static NumericEvaluator log(NumericEvaluator numberEvaluator) {
        return (NumericEvaluator) new NumericEvaluator("log").withParameter(numberEvaluator);
    }

}
