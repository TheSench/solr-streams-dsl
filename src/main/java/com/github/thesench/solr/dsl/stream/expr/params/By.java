package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class By extends StreamExpressionNamedParameter {
    public By(String field) {
        super("by", String.join(",", field));
    }
    public By(String... fields) {
        super("by", String.join(",", fields));
    }
}
