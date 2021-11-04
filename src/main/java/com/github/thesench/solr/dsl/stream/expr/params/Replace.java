package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.params.Replace.WithValue;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;


interface EmptyReplace {
    ReplaceWithField withFieldName(String fieldName);
    ReplaceWithField withField(Field field);
};

interface ReplaceWithField {
    ReplaceMissingReplacement withValue(String value);
}

interface ReplaceMissingReplacement {
    Replace withReplacement(WithValue withValue);
}

public class Replace extends StreamExpression implements FieldOrAliasOrReplace {

    public Replace() {
        super("replace");
    }

    @Override
    public StreamExpressionParameter format(AliasType aliasType) {
        return this;
    }

    public static Replace replace(Field field, String value, WithValue replacement) {
        return new ReplaceBuilder()
            .withField(field)
            .withValue(value)
            .withReplacement(replacement);
    }

    public static class ReplaceBuilder implements EmptyReplace, ReplaceWithField, ReplaceMissingReplacement {
        public Replace replace = new Replace();

        @Override
        public ReplaceWithField withFieldName(String fieldName) {
            replace.addParameter(fieldName);
            return this;
        }
    
        @Override
        public ReplaceWithField withField(Field field) {
            String fieldName = field.toString();
            return this.withFieldName(fieldName);
        }
    
        @Override
        public ReplaceMissingReplacement withValue(String value) {
            replace.addParameter(value);
            return this;
        }

        @Override
        public Replace withReplacement(WithValue withValue) {
            replace.addParameter(withValue);
            return replace;
        }
    }

    public static class WithValue extends StreamExpressionNamedParameter {
        public WithValue(String value) {
            super("withValue", value);
        }

        public static WithValue withValue(String value) {
            return new WithValue(value);
        }

        public static WithValue withValue(int value) {
            return new WithValue(Integer.toString(value));
        }

        public static WithValue withValue(double value) {
            return new WithValue(Double.toString(value));
        }
    }
}
