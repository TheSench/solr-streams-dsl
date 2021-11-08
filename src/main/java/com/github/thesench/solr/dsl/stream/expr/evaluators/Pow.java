package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

public class Pow {
    private Pow() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(FieldOrNumericEvaluator base, FieldOrNumericEvaluator exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(base)
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(FieldOrNumericEvaluator base, int exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(base)
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(FieldOrNumericEvaluator base, float exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(base)
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(FieldOrNumericEvaluator base, double exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(base)
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(int base, FieldOrNumericEvaluator exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(int base, int exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(int base, float exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(int base, double exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(float base, FieldOrNumericEvaluator exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(float base, int exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(float base, float exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(float base, double exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(double base, FieldOrNumericEvaluator exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(double base, int exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(double base, float exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumericEvaluator pow(double base, double exponent) {
        return (NumericEvaluator) new NumericEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Double.toString(exponent));
    }
}
