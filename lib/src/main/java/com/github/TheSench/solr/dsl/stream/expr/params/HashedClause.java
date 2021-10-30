package com.github.TheSench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class HashedClause extends StreamExpressionNamedParameter {
    public HashedClause(StreamExpression stream) {
        super("hashed", stream);
    }
}
