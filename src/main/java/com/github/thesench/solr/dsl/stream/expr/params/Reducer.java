package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;

public class Reducer extends StreamExpression {
    public Reducer(String name, StreamExpressionParameter... parameters) {
        super(name);
        for (StreamExpressionParameter parameter : parameters) {
            addParameter(parameter);
        }
    }

    public static Reducer distinct() {
        return new Reducer("distinct");
    }

    public static Reducer group(Sort sort, N n) {
        return new Reducer("group", sort, n);
    }
}
