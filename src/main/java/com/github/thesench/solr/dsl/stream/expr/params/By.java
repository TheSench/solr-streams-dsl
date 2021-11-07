package com.github.thesench.solr.dsl.stream.expr.params;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class By extends StreamExpressionNamedParameter {
    public By(String field) {
        super("by", field);
    }

    public By(String... fields) {
        super("by", String.join(",", fields));
    }

    public static By by(String field) {
        return new By(field);
    }

    public static By by(String... fields) {
        return new By(fields);
    }

    public static By by(Field field) {
        return new By(field.toString());
    }

    public static By by(Field... fields) {
        String fieldList = Arrays.stream(fields)
            .map(Field::toString)
            .collect(Collectors.joining(","));
        return new By(fieldList);
    }
}
