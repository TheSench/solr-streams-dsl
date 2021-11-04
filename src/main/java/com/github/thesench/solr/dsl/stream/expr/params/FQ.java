package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class FQ extends StreamExpressionNamedParameter implements SearchParameter {
    public FQ(String filterQuery) {
        super(CommonParams.FQ, filterQuery);
    }

    public static FQ fq(String filterQuery) {
        return new FQ(filterQuery);
    }
}
