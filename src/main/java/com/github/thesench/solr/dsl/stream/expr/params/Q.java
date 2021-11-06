package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class Q extends StreamExpressionNamedParameter implements SearchParameter {
    public Q(String query) {
        super(CommonParams.Q, query);
    }

    public static Q q(String query) {
        return new Q(query);
    }
}
