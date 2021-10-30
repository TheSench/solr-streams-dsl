package com.github.TheSench.solr.dsl.stream.expr.decorators;

import com.github.TheSench.solr.dsl.stream.expr.params.BatchSizeClause;
import com.github.TheSench.solr.dsl.stream.expr.params.FieldListClause;
import com.github.TheSench.solr.dsl.stream.expr.params.OnClause;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class FetchStreams {
    public static StreamExpression fetch(String collection, StreamExpression stream, FieldListClause fl, OnClause on) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on);
    }

    public static StreamExpression fetch(String collection, StreamExpression stream, FieldListClause fl, OnClause on, BatchSizeClause batchSize) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on)
            .withParameter(batchSize);
    }
}
