package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

public class Mod {
    private Mod() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(FieldOrNumericEvaluator divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(divisor)
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(FieldOrNumericEvaluator divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(FieldOrNumericEvaluator divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(FieldOrNumericEvaluator divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(divisor)
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(int divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(int divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(int divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(int divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Integer.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(float divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(float divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(float divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(float divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Float.toString(divisor))
            .withParameter(Double.toString(dividend));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(double divisor, FieldOrNumericEvaluator dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(dividend);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(double divisor, int dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Integer.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(double divisor, float dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Float.toString(dividend));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param divisor
     * @param dividend
     * @return
     */
    public static NumericEvaluator mod(double divisor, double dividend) {
        return (NumericEvaluator) new NumericEvaluator("mod")
            .withParameter(Double.toString(divisor))
            .withParameter(Double.toString(dividend));
    }
}
