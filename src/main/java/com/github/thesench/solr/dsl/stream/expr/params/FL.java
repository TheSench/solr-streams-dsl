package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class FL extends StreamExpressionNamedParameter implements SearchParameter {
    public FL(String ...fields) {
        super(CommonParams.FL, String.join(",", fields));
    }

    public static FL fl(String... fields) {
        return new FL(fields);
    }
}
