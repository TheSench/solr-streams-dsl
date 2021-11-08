package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

public class Pow {
    private Pow() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(FieldOrNumberEvaluator base, FieldOrNumberEvaluator exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(base)
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(FieldOrNumberEvaluator base, int exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(base)
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(FieldOrNumberEvaluator base, float exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(base)
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(FieldOrNumberEvaluator base, double exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(base)
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(int base, FieldOrNumberEvaluator exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(int base, int exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(int base, float exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(int base, double exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Integer.toString(base))
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(float base, FieldOrNumberEvaluator exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(float base, int exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(float base, float exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(float base, double exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Float.toString(base))
            .withParameter(Double.toString(exponent));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(double base, FieldOrNumberEvaluator exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(exponent);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(double base, int exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Integer.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(double base, float exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Float.toString(exponent));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#pow">Stream Evaluator Reference: pow</a>
     * @param base
     * @param exponent
     * @return
     */
    public static NumberEvaluator pow(double base, double exponent) {
        return (NumberEvaluator) new NumberEvaluator("pow")
            .withParameter(Double.toString(base))
            .withParameter(Double.toString(exponent));
    }
}
