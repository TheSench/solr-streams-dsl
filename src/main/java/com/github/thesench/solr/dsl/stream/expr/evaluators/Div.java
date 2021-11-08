package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

public class Div {
    private Div() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(FieldOrNumberEvaluator divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(divisor)
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(FieldOrNumberEvaluator divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(divisor)
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(FieldOrNumberEvaluator divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(divisor)
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(FieldOrNumberEvaluator divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(divisor)
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(int divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(int divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(int divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(int divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(float divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(float divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(float divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(float divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(double divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(double divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(double divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(double divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Double.toString(dividend));
    }
}
