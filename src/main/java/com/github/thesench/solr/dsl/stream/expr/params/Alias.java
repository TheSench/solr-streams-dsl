package com.github.thesench.solr.dsl.stream.expr.params;

import java.util.function.BiFunction;

public class Alias implements FieldOrAlias {
    private final String fieldName;
    private final String alias;

    public Alias(String fieldName, String alias) {
        this.fieldName = fieldName;
        this.alias = alias;
    }

    @Override
    public String format(BiFunction<String, String, String> aliasFormatter) {
        return aliasFormatter.apply(fieldName, alias);
    }
}
