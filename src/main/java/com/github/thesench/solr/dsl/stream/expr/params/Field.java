package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionValue;

public class Field extends StreamExpressionValue implements FieldOrAlias, FieldOrAliasOrReplace, FieldOrEvaluator, FieldOrNumberEvaluator, FieldOrBooleanEvaluator {

    public Field(String fieldName) {
        super(fieldName);
    }

    public Alias as(String alias) {
        return new Alias(this.getValue(), alias);
    }

    public SortedField asc() {
        return new SortedField(this.getValue(), SortDirection.ASC);
    }

    public SortedField desc() {
        return new SortedField(this.getValue(), SortDirection.DESC);
    }

    @Override
    public StreamExpressionParameter format(AliasType aliasType) {
        return this;
    }
}
