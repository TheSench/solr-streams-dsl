package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.BatchSize;
import com.github.thesench.solr.dsl.stream.expr.params.FL;
import com.github.thesench.solr.dsl.stream.expr.params.On;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class FetchStreams {
    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on);
    }

    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on, BatchSize batchSize) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on)
            .withParameter(batchSize);
    }
}
