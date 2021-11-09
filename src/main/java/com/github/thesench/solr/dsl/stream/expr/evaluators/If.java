package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, FieldOrEvaluator whenTrue, FieldOrEvaluator whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, FieldOrEvaluator whenTrue, int whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, FieldOrEvaluator whenTrue, float whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, FieldOrEvaluator whenTrue, double whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, FieldOrEvaluator whenTrue, String whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, int whenTrue, FieldOrEvaluator whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, int whenTrue, int whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, int whenTrue, float whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, int whenTrue, double whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, int whenTrue, String whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, double whenTrue, FieldOrEvaluator whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, double whenTrue, int whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, double whenTrue, float whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, double whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(condition)
            .withParameter(Double.toString(whenTrue))
            .withParameter(Double.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(FieldOrBooleanEvaluator condition, double whenTrue, String whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, String whenTrue, FieldOrEvaluator whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, String whenTrue, int whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, String whenTrue, float whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, String whenTrue, double whenFalse) {
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
    public static Evaluator if_(FieldOrBooleanEvaluator condition, String whenTrue, String whenFalse) {
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
    public static Evaluator if_(boolean condition, FieldOrEvaluator whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, FieldOrEvaluator whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, FieldOrEvaluator whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, FieldOrEvaluator whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, FieldOrEvaluator whenTrue, String whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, int whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, int whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, int whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, int whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, int whenTrue, String whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, double whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, double whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, double whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, double whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
            .withParameter(Double.toString(whenTrue))
            .withParameter(Double.toString(whenFalse));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#if">Stream Evaluator Reference: if</a>
     * @param condition
     * @param whenTrue
     * @param whenFalse
     * @return
     */
    public static Evaluator if_(boolean condition, double whenTrue, String whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, String whenTrue, FieldOrEvaluator whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, String whenTrue, int whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, String whenTrue, float whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, String whenTrue, double whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
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
    public static Evaluator if_(boolean condition, String whenTrue, String whenFalse) {
        return (Evaluator) new Evaluator("if")
            .withParameter(Boolean.toString(condition))
            .withParameter(whenTrue)
            .withParameter(whenFalse);
    }

}
