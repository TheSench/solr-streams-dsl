package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionValue;

public class RawValue extends StreamExpressionValue {
    public RawValue(String value) {
        super(value);
    }

    public static RawValue raw(String value) {
        return new RawValue(value);
    }

    public static RawValue raw(int value) {
        return new RawValue(Integer.toString(value));
    }

    public static RawValue raw(double value) {
        return new RawValue(Double.toString(value));
    }

    public static RawValue raw(float value) {
        return new RawValue(Float.toString(value));
    }
}
