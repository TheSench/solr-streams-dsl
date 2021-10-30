package com.github.TheSench.solr.dsl.stream.expr.params;

import com.github.TheSench.solr.dsl.stream.expr.sources.StreamExpressionSearchParameter;

import org.apache.solr.common.params.CommonParams;

public class FieldListClause extends StreamExpressionSearchParameter {
    public FieldListClause(String ...fields) {
        super(CommonParams.FL, String.join(",", fields));
    }

    public static FieldListClause fl(String... fields) {
        return new FieldListClause(fields);
    }
}
