package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class BatchSizeClause extends StreamExpressionNamedParameter{
    public BatchSizeClause(int batchSize) {
        super("batchSize", Integer.toString(batchSize));
    }

    public static BatchSizeClause batchSize(int batchSize) {
        return new BatchSizeClause(batchSize);
    }
}
