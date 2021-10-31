package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class N extends StreamExpressionNamedParameter {
    public N(int n) {
        super("n", Integer.toString(n));
    }
}
