package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.By;
import com.github.thesench.solr.dsl.stream.expr.params.Reducer;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class ReduceStreams {
    public static StreamExpression reduce(StreamExpression stream, By by, Reducer reducer) {
        return new StreamExpression("reduce")
            .withParameter(stream)
            .withParameter(by)
            .withParameter(reducer);
    }
}
