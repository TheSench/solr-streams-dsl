package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class BatchSize extends StreamExpressionNamedParameter{
    public BatchSize(int batchSize) {
        super("batchSize", Integer.toString(batchSize));
    }

    public static BatchSize batchSize(int batchSize) {
        return new BatchSize(batchSize);
    }
}
