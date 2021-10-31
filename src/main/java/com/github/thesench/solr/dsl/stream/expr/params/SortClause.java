package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.StreamExpressionSearchParameter;

import org.apache.solr.common.params.CommonParams;

public class SortClause extends StreamExpressionSearchParameter {
    public SortClause(String sort) {
        super(CommonParams.SORT, sort);
    }
}
