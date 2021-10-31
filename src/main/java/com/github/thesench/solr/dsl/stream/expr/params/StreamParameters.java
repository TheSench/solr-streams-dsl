package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.StreamExpressionSearchParameter;

import org.apache.solr.common.params.CommonParams;

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

    public static StreamExpressionSearchParameter fq(String filterQuery) {
        return new StreamExpressionSearchParameter(CommonParams.FQ, filterQuery);
    }

    public static Reducer group(SortClause sort, N n) {
        return new Reducer("group", sort, n);
    }

    public static N n(int n) {
        return new N(n);
    }

    public static On on(String fieldInBoth) {
        return new On(fieldInBoth);
    }

    public static On on(String fieldInLeft, String fieldInRight) {
        return new On(fieldInLeft, fieldInRight);
    }

    public static ProductSort productSort(SortFields sortFields) {
        return new ProductSort(sortFields.toString());
    }

    public static ProductSort productSort(String sorts) {
        return new ProductSort(sorts);
    }

    public static StreamExpressionSearchParameter q(String query) {
        return new StreamExpressionSearchParameter(CommonParams.Q, query);
    }

    public static StreamExpressionSearchParameter qt(RequestHandler requestHandler) {
        return new StreamExpressionSearchParameter(CommonParams.QT, requestHandler.toString());
    }

    public static StreamExpressionSearchParameter raw(String name, String value) {
        return new StreamExpressionSearchParameter(name, value);
    }

    public static StreamExpressionSearchParameter rows(int numRows) {
        return new StreamExpressionSearchParameter(CommonParams.ROWS, Integer.toString(numRows));
    }

    public static SortClause sort(SortFields sortField) {
        return new SortClause(sortField.toString());
    }

    public static SortClause sort(String sort) {
        return new SortClause(sort);
    }

    public static SortClause sort(String... sorts) {
        return new SortClause(String.join(",", sorts));
    }
}
