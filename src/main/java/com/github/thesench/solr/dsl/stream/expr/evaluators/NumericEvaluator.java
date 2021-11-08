package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.FieldOrNumericEvaluator;

public class NumericEvaluator extends Evaluator implements FieldOrNumericEvaluator {
    public NumericEvaluator(String functionName) {
        super(functionName);
    }
}
