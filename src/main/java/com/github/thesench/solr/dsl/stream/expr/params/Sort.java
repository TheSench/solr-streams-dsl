package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class Sort extends StreamExpressionNamedParameter implements SearchParameter {
    public Sort(String sort) {
        super(CommonParams.SORT, sort);
    }
}
