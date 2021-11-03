package com.github.thesench.solr.dsl.stream.expr.params;

import java.util.function.BiFunction;

public interface FieldOrAlias {
    public String format(BiFunction<String, String, String> aliasFormatter);
}
