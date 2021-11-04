package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Div {
    private Div() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(Field firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(Field firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(Field firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(Field firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(Field firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(NumberEvaluator firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(NumberEvaluator firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(NumberEvaluator firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(NumberEvaluator firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(NumberEvaluator firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(firstValue)
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(int firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(int firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(int firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(int firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(int firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(float firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(float firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(float firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(float firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(float firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Float.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(double firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(double firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(double firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(double firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#div">Stream Evaluator Reference: div</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator div(double firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("div")
            .withParameter(Double.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }
}
