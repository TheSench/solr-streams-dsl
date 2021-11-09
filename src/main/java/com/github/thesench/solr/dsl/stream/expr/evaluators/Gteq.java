package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;;

public class Gteq {
    private Gteq() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(FieldOrEvaluator left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(left)
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(FieldOrEvaluator left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(left)
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(FieldOrEvaluator left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(left)
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(FieldOrEvaluator left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(left)
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(int left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Integer.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(int left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Integer.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(int left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Integer.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(int left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Integer.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(float left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Float.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(float left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Float.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(float left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Float.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(float left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Float.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(double left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Double.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(double left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Double.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(double left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Double.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gteq">Stream Evaluator Reference: gteq</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gteq(double left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gteq")
            .withParameter(Double.toString(left))
            .withParameter(Double.toString(right));
    }
}
