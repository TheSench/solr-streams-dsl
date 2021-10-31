package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class OnClause extends StreamExpressionNamedParameter {

    public OnClause(String fieldInBoth) {
        super("on", fieldInBoth);
    }

    public OnClause(String fieldInLeft, String fieldInRight) {
        super("on");
        setParameter(fieldInLeft, fieldInRight);
    }

    private void setParameter(String fieldInLeft, String fieldInRight) {
        super.setParameter(fieldInLeft + "=" + fieldInRight);
    }

    public static OnClause on(String fieldInBoth) {
        return new OnClause(fieldInBoth);
    }

    public static OnClause on(String fieldInLeft, String fieldInRight) {
        return new OnClause(fieldInLeft, fieldInRight);
    }
}