package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class NClause extends StreamExpressionNamedParameter {
    public NClause(int n) {
        super("n", Integer.toString(n));
    }

    public static NClause n(int n) {
        return new NClause(n);
    }
}
