package com.github.thesench.solr.dsl.stream.expr.params;

import java.util.function.BiFunction;

public class Field implements FieldOrAlias {
    private final String fieldName;

    public Field(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String format(BiFunction<String, String, String> aliasFormatter) {
        return fieldName;
    }

    @Override
    public String toString() {
        return fieldName;
    }

    public Alias as(String alias) {
        return new Alias(this.fieldName, alias);
    }
}
