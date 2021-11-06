package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.AliasType;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrAliasOrReplace;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;

public class Select {
    private Select() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#select">Stream Decorator Reference: select</a>
     * @param stream
     * @param fields
     * @return
     */
    public static StreamExpression select(StreamExpression stream, String ...fields) {
        StreamExpression selectStream = new StreamExpression("select")
            .withParameter(stream);
        for (String field : fields) {
            selectStream.addParameter(field);
        }
        return selectStream;
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#select">Stream Decorator Reference: select</a>
     * @param stream
     * @param fields
     * @return
     */
    public static StreamExpression select(StreamExpression stream, FieldOrAliasOrReplace... fields) {
        StreamExpression selectStream = new StreamExpression("select")
            .withParameter(stream);
        for (FieldOrAliasOrReplace fieldOrAlias : fields) {
            StreamExpressionParameter formattedField = fieldOrAlias.format(AliasType.AS);
            selectStream.addParameter(formattedField);
        }
        return selectStream;
    }

}
