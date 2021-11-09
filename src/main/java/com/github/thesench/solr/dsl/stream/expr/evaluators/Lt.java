package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;;

public class Lt {
    private Lt() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(FieldOrEvaluator left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(left)
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(FieldOrEvaluator left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(left)
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(FieldOrEvaluator left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(left)
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(FieldOrEvaluator left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(left)
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(int left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Integer.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(int left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Integer.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(int left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Integer.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(int left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Integer.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(float left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Float.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(float left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Float.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(float left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Float.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(float left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Float.toString(left))
            .withParameter(Double.toString(right));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(double left, FieldOrEvaluator right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Double.toString(left))
            .withParameter(right);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(double left, int right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Double.toString(left))
            .withParameter(Integer.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(double left, float right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Double.toString(left))
            .withParameter(Float.toString(right));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#lt">Stream Evaluator Reference: lt</a>
     * @param left
     * @param right
     * @return
     */
    public static BooleanEvaluator lt(double left, double right) {
        return (BooleanEvaluator) new BooleanEvaluator("lt")
            .withParameter(Double.toString(left))
            .withParameter(Double.toString(right));
    }
}
