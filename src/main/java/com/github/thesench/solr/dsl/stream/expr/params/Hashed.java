package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class Hashed extends StreamExpressionNamedParameter {
    public Hashed(StreamExpression stream) {
        super("hashed", stream);
    }

    public static Hashed hashed(StreamExpression stream) {
        return new Hashed(stream);
    }
}
