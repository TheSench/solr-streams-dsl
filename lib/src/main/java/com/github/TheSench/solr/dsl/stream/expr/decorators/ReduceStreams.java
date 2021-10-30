package com.github.TheSench.solr.dsl.stream.expr.decorators;

import com.github.TheSench.solr.dsl.stream.expr.params.ByClause;
import com.github.TheSench.solr.dsl.stream.expr.params.ReducerClause;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class ReduceStreams {
    public static StreamExpression reduce(StreamExpression stream, ByClause by, ReducerClause reducer) {
        return new StreamExpression("reduce")
            .withParameter(stream)
            .withParameter(by)
            .withParameter(reducer);
    }
}
