package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionValue;

public class Field extends StreamExpressionValue implements FieldOrAlias {

    public Field(String fieldName) {
        super(fieldName);
    }

    public Alias as(String alias) {
        return new Alias(this.getValue(), alias);
    }

    public StreamExpressionValue format(AliasType aliasType) {
        return this;
    }
}
