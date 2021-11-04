package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class RawSearchParameter extends StreamExpressionNamedParameter implements SearchParameter {
    public RawSearchParameter(String name, String value) {
        super(name, value);
    }

    public static RawSearchParameter raw(String name, String value) {
        return new RawSearchParameter(name, value);
    }
}
