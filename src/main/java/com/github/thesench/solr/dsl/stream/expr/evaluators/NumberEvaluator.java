package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumberEvaluator;

public class NumberEvaluator extends Evaluator implements FieldOrNumberEvaluator {
    public NumberEvaluator(String functionName) {
        super(functionName);
    }
}
