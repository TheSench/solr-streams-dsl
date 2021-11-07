package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionValue;

public class Field extends StreamExpressionValue implements FieldOrAlias, FieldOrAliasOrReplace, FieldOrEvaluator {

    public Field(String fieldName) {
        super(fieldName);
    }

    public Alias as(String alias) {
        return new Alias(this.getValue(), alias);
    }

    public SortFields asc() {
        return SortFields.by(this.getValue(), SortDirection.ASC);
    }

    public SortFields desc() {
        return SortFields.by(this.getValue(), SortDirection.DESC);
    }

    public StreamExpressionValue format(AliasType aliasType) {
        return this;
    }
}
