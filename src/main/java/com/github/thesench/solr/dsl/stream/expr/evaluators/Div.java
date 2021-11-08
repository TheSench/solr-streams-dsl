package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

public class Div {
    private Div() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(FieldOrNumericEvaluator divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(divisor)
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(FieldOrNumericEvaluator divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(divisor)
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(FieldOrNumericEvaluator divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(divisor)
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(FieldOrNumericEvaluator divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(divisor)
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(int divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(int divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(int divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(int divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Integer.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(float divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(float divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(float divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(float divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Float.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(double divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(double divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(double divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator div(double divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("div")
            .withParameter(Double.toString(divisor))
            .withParameter(Double.toString(dividend));
    }
}
