package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.StreamExpressionSearchParameter;

import org.apache.solr.common.params.CommonParams;

public class FL extends StreamExpressionSearchParameter {
    public FL(String ...fields) {
        super(CommonParams.FL, String.join(",", fields));
    }
}
