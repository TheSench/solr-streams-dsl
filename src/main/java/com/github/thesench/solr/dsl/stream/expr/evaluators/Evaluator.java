package com.github.thesench.solr.dsl.stream.expr.evaluators;

import com.github.thesench.solr.dsl.stream.expr.params.Alias;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Evaluator extends StreamExpression implements FieldOrEvaluator {
    public Evaluator(String functionName) {
        super(functionName);
    }

    public Alias as(String alias) {
        return new Alias(this.toString(), alias);
    }
}
