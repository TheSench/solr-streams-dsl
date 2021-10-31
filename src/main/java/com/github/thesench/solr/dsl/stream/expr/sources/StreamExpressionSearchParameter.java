package com.github.thesench.solr.dsl.stream.expr.sources;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class StreamExpressionSearchParameter extends StreamExpressionNamedParameter {
    public StreamExpressionSearchParameter(String name, String value) {
        super(name, value);
    }

    protected StreamExpressionSearchParameter(String name) {
        super(name);
    }
}
