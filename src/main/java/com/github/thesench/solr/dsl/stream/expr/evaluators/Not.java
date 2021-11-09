package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;

public class Not {
    private Not() {}    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#not">Stream Evaluator Reference: not</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator not(FieldOrBooleanEvaluator fieldOrEvaluator) {
        return (BooleanEvaluator) new BooleanEvaluator("not")
            .withParameter(fieldOrEvaluator);
    }    

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-evaluator-reference.html#not">Stream Evaluator Reference: not</a>
     * @param leftValue
     * @param rightValue
     * @return
     */
    public static BooleanEvaluator not(boolean value) {
        return (BooleanEvaluator) new BooleanEvaluator("not")
            .withParameter(Boolean.toString(value));
    }
}
