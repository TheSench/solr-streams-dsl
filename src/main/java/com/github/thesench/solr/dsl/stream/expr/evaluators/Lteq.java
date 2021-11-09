package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;;

public class Lteq {
    private Lteq() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(FieldOrEvaluator left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(left)
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(FieldOrEvaluator left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(left)
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(FieldOrEvaluator left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(left)
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(FieldOrEvaluator left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(left)
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(int left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Integer.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(int left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Integer.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(int left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Integer.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(int left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Integer.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(float left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Float.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(float left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Float.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(float left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Float.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(float left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Float.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(double left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Double.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(double left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Double.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(double left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Double.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lteq">Stream Evaluator Reference: lteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lteq(double left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lteq")
            .withParameter(Double.toString(left))
            .withParameter(Double.toString(right));
    }
}
