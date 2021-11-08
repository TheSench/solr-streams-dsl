package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Div {
    private Div() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator div(Field divisor, Field dividend) {
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
    public static NumberEvaluator div(Field divisor, NumberEvaluator dividend) {
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
    public static NumberEvaluator div(Field divisor, int dividend) {
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
    public static NumberEvaluator div(Field divisor, float dividend) {
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
    public static NumberEvaluator div(Field divisor, double dividend) {
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
    public static NumberEvaluator div(NumberEvaluator divisor, Field dividend) {
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
    public static NumberEvaluator div(NumberEvaluator divisor, NumberEvaluator dividend) {
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
    public static NumberEvaluator div(NumberEvaluator divisor, int dividend) {
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
    public static NumberEvaluator div(NumberEvaluator divisor, float dividend) {
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
    public static NumberEvaluator div(NumberEvaluator divisor, double dividend) {
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
    public static NumberEvaluator div(int divisor, Field dividend) {
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
    public static NumberEvaluator div(int divisor, NumberEvaluator dividend) {
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
    public static NumberEvaluator div(float divisor, Field dividend) {
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
    public static NumberEvaluator div(float divisor, NumberEvaluator dividend) {
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
    public static NumberEvaluator div(double divisor, Field dividend) {
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
    public static NumberEvaluator div(double divisor, NumberEvaluator dividend) {
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
