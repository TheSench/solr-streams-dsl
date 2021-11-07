package com.github.thesench.solr.dsl.stream.expr.params;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class FL extends StreamExpressionNamedParameter implements SearchParameter {
    public FL(String fieldList) {
        super(CommonParams.FL, fieldList);
    }

    public FL(String ...fields) {
        super(CommonParams.FL, String.join(",", fields));
    }

    public static FL fl(String... fields) {
        return new FL(fields);
    }

    public static FL fl(Field... fields) {
        String fieldList = Arrays.stream(fields)
            .map(Field::toString)
            .collect(Collectors.joining(","));
        return new FL(fieldList);
    }
}
