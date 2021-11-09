package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;;

public class Gt {
    private Gt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(FieldOrEvaluator left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(left)
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(FieldOrEvaluator left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(left)
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(FieldOrEvaluator left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(left)
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(FieldOrEvaluator left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(left)
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(int left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Integer.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(int left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Integer.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(int left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Integer.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(int left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Integer.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(float left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Float.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(float left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Float.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(float left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Float.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(float left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Float.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(double left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Double.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(double left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Double.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(double left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Double.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#gt">Stream Evaluator Reference: gt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator gt(double left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("gt")
            .withParameter(Double.toString(left))
            .withParameter(Double.toString(right));
    }
}
