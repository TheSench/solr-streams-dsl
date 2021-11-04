package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;

public class If {
    private If() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, FieldOrEvaluator whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(whenTrue)
            .withParameter(whenFalse);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, int whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Integer.toString(whenTrue))
            .withParameter(whenFalse);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, float whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Float.toString(whenTrue))
            .withParameter(whenFalse);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, double whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Double.toString(whenTrue))
            .withParameter(whenFalse);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, FieldOrEvaluator whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(whenTrue)
            .withParameter(Integer.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, int whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Integer.toString(whenTrue))
            .withParameter(Integer.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, float whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Float.toString(whenTrue))
            .withParameter(Integer.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, double whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Double.toString(whenTrue))
            .withParameter(Integer.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, FieldOrEvaluator whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(whenTrue)
            .withParameter(Float.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, int whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Integer.toString(whenTrue))
            .withParameter(Float.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, float whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Float.toString(whenTrue))
            .withParameter(Float.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, double whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Double.toString(whenTrue))
            .withParameter(Float.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, FieldOrEvaluator whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(whenTrue)
            .withParameter(Double.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, int whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Integer.toString(whenTrue))
            .withParameter(Double.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, float whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Float.toString(whenTrue))
            .withParameter(Double.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(BooleanEvaluator condition, double whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Double.toString(whenTrue))
            .withParameter(Double.toString(whenFalse));
    }
}
