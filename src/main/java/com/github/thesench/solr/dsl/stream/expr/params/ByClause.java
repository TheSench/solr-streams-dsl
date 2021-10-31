package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class ByClause extends StreamExpressionNamedParameter {
    public ByClause(String field) {
        super("by", String.join(",", field));
    }
    public ByClause(String... fields) {
        super("by", String.join(",", fields));
    }

    public static ByClause by(String field) {
        return new ByClause(field);
    }

    public static ByClause by(String... fields) {
        return new ByClause(fields);
    }
}
