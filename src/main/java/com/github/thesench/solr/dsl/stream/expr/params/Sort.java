package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class Sort extends StreamExpressionNamedParameter implements SearchParameter {
    public Sort(String sort) {
        super(CommonParams.SORT, sort);
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
