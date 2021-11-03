package com.github.thesench.solr.dsl.stream.expr.evaluators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Evaluator extends StreamExpression {
    public Evaluator(String functionName) {
        super(functionName);
    }

    public String as(String alias) {
        return null;
    }
}
