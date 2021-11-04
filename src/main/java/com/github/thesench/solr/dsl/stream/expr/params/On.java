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

    public static On on(String fieldInBoth) {
        return new On(fieldInBoth);
    }

    public static On on(String fieldInLeft, String fieldInRight) {
        return new On(fieldInLeft, fieldInRight);
    }

    public static On on(Field fieldInBoth) {
        return new On(fieldInBoth.getValue());
    }

    public static On on(Field fieldInLeft, Field fieldInRight) {
        return new On(fieldInLeft.getValue(), fieldInRight.getValue());
    }
}
