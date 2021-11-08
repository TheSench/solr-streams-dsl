package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

public class Mod {
    private Mod() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(Field firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(Field firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(Field firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(Field firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(Field firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(NumberEvaluator firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(NumberEvaluator firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(NumberEvaluator firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(NumberEvaluator firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(NumberEvaluator firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(firstValue)
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(int firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(int firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(int firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(int firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(int firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Integer.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(float firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(float firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(float firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(float firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(float firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Float.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(double firstValue, Field secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(firstValue))
            .withParameter(secondValue);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(double firstValue, NumberEvaluator secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(firstValue))
            .withParameter(secondValue);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(double firstValue, int secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(firstValue))
            .withParameter(Integer.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(double firstValue, float secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(firstValue))
            .withParameter(Float.toString(secondValue));
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#mod">Stream Evaluator Reference: mod</a>
     * @param firstValue
     * @param secondValue
     * @return
     */
    public static NumberEvaluator mod(double firstValue, double secondValue) {
        return (NumberEvaluator) new NumberEvaluator("mod")
            .withParameter(Double.toString(firstValue))
            .withParameter(Double.toString(secondValue));
    }
}
