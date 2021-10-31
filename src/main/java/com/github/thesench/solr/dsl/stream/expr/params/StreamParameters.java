package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

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

    public static FQ fq(String filterQuery) {
        return new FQ(filterQuery);
    }

    public static Reducer group(Sort sort, N n) {
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

    public static Q q(String query) {
        return new Q(query);
    }

    public static QT qt(RequestHandler requestHandler) {
        return new QT(requestHandler);
    }

    public static RawSearchParameter raw(String name, String value) {
        return new RawSearchParameter(name, value);
    }

    public static Rows rows(int numRows) {
        return new Rows(numRows);
    }

    public static Sort sort(SortFields sortField) {
        return new Sort(sortField.toString());
    }

    public static Sort sort(String sort) {
        return new Sort(sort);
    }

    public static Sort sort(String... sorts) {
        return new Sort(String.join(",", sorts));
    }
}
