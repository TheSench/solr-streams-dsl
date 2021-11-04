package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class StreamParameters {
    private StreamParameters() {}

    public static BatchSize batchSize(int batchSize) {
        return new BatchSize(batchSize);
    }

    public static By by(String field) {
        return new By(field);
    }

    public static By by(String... fields) {
        return new By(fields);
    }

    public static Reducer distinct() {
        return new Reducer("distinct");
    }

    public static FL fl(String... fields) {
        return new FL(fields);
    }

    public static Reducer group(Sort sort, N n) {
        return new Reducer("group", sort, n);
    }

    public static RawSearchParameter raw(String name, String value) {
        return new RawSearchParameter(name, value);
    }
}
