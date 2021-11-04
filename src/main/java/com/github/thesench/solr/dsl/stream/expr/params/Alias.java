package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionValue;

public class Alias extends StreamExpressionValue implements FieldOrAlias, FieldOrAliasOrReplace {
    private final String alias;

    public Alias(String fieldName, String alias) {
        super(fieldName);
        this.alias = alias;
    }

    @Override
    public StreamExpressionParameter format(AliasType aliasType) {
        String value;
        switch(aliasType) {
            case AS:
                value = String.join(" as ", getValue(), alias);
                break;
            case COLON:
                value = String.join(":", alias, getValue());
                break;
            default:
                throw new IllegalArgumentException("Invalid AliasType specified");
        }
        return new StreamExpressionValue(value);
    }
}
