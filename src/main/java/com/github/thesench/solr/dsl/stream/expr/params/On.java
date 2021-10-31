package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class On extends StreamExpressionNamedParameter {

    public On(String fieldInBoth) {
        super("on", fieldInBoth);
    }

    public On(String fieldInLeft, String fieldInRight) {
        super("on");
        setParameter(fieldInLeft, fieldInRight);
    }

    private void setParameter(String fieldInLeft, String fieldInRight) {
        super.setParameter(fieldInLeft + "=" + fieldInRight);
    }
}
