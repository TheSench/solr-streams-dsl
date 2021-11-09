package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrBooleanEvaluator;

public class BooleanEvaluator extends Evaluator implements FieldOrBooleanEvaluator {
    public BooleanEvaluator(String functionName) {
        super(functionName);
    }
}
