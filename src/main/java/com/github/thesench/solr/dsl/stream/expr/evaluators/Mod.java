package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

public class Mod {
    private Mod() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(FieldOrNumberEvaluator divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(divisor)
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(FieldOrNumberEvaluator divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(FieldOrNumberEvaluator divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(FieldOrNumberEvaluator divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(int divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(int divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(int divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(int divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(float divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(float divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(float divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(float divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(double divisor, FieldOrNumberEvaluator dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(double divisor, int dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(double divisor, float dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumberEvaluator mod(double divisor, double dividend) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Double.toString(dividend));
    }
}
