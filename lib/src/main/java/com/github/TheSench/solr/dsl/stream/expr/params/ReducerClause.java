package com.github.TheSench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;

public class ReducerClause extends StreamExpression {
    public ReducerClause(String name, StreamExpressionParameter... parameters) {
        super(name);
        for (StreamExpressionParameter parameter : parameters) {
            addParameter(parameter);
        }
    }

    public static ReducerClause group(SortClause sort, NClause n) {
        return new ReducerClause("group", sort, n);
    }

    public static ReducerClause distinct() {
        return new ReducerClause("distinct");
    }
}
