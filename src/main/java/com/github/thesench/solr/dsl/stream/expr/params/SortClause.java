package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SortFields;
import com.github.thesench.solr.dsl.stream.expr.sources.StreamExpressionSearchParameter;

import org.apache.solr.common.params.CommonParams;

public class SortClause extends StreamExpressionSearchParameter {
    public SortClause(String sort) {
        super(CommonParams.SORT, sort);
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
