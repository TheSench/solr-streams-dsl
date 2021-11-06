package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.AliasType;
import com.github.thesench.solr.dsl.stream.expr.params.BatchSize;
import com.github.thesench.solr.dsl.stream.expr.params.By;
import com.github.thesench.solr.dsl.stream.expr.params.FL;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrAliasOrReplace;
import com.github.thesench.solr.dsl.stream.expr.params.Hashed;
import com.github.thesench.solr.dsl.stream.expr.params.N;
import com.github.thesench.solr.dsl.stream.expr.params.On;
import com.github.thesench.solr.dsl.stream.expr.params.Reducer;
import com.github.thesench.solr.dsl.stream.expr.params.Sort;

import org.apache.commons.lang.NotImplementedException;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionParameter;

public class StreamDecorators {
    private StreamDecorators() {}

    public static StreamExpression classify() {
        throw new NotImplementedException();
    }

    public static StreamExpression commit() {
        throw new NotImplementedException();
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#complement">Stream Decorator Reference: complement</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression complement(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("complement")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    public static StreamExpression daemon() {
        throw new NotImplementedException();
    }

    public static StreamExpression delete() {
        throw new NotImplementedException();
    }

    public static StreamExpression eval() {
        throw new NotImplementedException();
    }

    public static StreamExpression executor() {
        throw new NotImplementedException();
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#fetch">Stream Decorator Reference: fetch</a>
     * @param collection
     * @param stream
     * @param fl
     * @param on
     * @return
     */
    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#fetch">Stream Decorator Reference: fetch</a>
     * @param collection
     * @param stream
     * @param fl
     * @param on
     * @param batchSize
     * @return
     */
    public static StreamExpression fetch(String collection, StreamExpression stream, FL fl, On on, BatchSize batchSize) {
        return new StreamExpression("fetch")
            .withParameter(collection)
            .withParameter(stream)
            .withParameter(fl)
            .withParameter(on)
            .withParameter(batchSize);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#hashJoin">Stream Decorator Reference: hashJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression hashJoin(StreamExpression leftStream, Hashed rightStream, On onClause) {
        return new StreamExpression("hashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    public static StreamExpression having() {
        throw new NotImplementedException();
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#intersect">Stream Decorator Reference: intersect</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression intersect(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("intersect")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#innerJoin">Stream Decorator Reference: innerJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression innerJoin(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("innerJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#leftOuterJoin">Stream Decorator Reference: leftOuterJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression leftOuterJoin(StreamExpression leftStream, StreamExpression rightStream, On onClause) {
        return new StreamExpression("leftOuterJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#list">Stream Decorator Reference: list</a>
     * @param stream1
     * @param stream2
     * @return
     */
    public static StreamExpression list(StreamExpression stream1, StreamExpression stream2) {
        return new StreamExpression("list")
            .withParameter(stream1)
            .withParameter(stream2);
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#list">Stream Decorator Reference: list</a>
     * @param streams
     * @return
     */
    public static StreamExpression list(StreamExpression... streams) {
        StreamExpression expression = new StreamExpression("list");
        for (StreamExpression stream : streams) {
            expression.addParameter(stream);
        }
        return expression;
    }

    public static StreamExpression merge() {
        throw new NotImplementedException();
    }

    public static StreamExpression null_() {
        throw new NotImplementedException();
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#outerHashJoin">Stream Decorator Reference: outerHashJoin</a>
     * @param leftStream
     * @param rightStream
     * @param onClause
     * @return
     */
    public static StreamExpression outerHashJoin(StreamExpression leftStream, Hashed rightStream, On onClause) {
        return new StreamExpression("outerHashJoin")
            .withParameter(leftStream)
            .withParameter(rightStream)
            .withParameter(onClause);
    }

    public static StreamExpression parallel() {
        throw new NotImplementedException();
    }

    public static StreamExpression plist() {
        throw new NotImplementedException();
    }

    public static StreamExpression priority() {
        throw new NotImplementedException();
    }

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#reduce">Stream Decorator Reference: reduce</a>
     * @param stream
     * @param by
     * @param reducer
     * @return
     */
    public static StreamExpression reduce(StreamExpression stream, By by, Reducer reducer) {
        return new StreamExpression("reduce")
            .withParameter(stream)
            .withParameter(by)
            .withParameter(reducer);
    }

    public static StreamExpression rollup() {
        throw new NotImplementedException();
    }

    public static StreamExpression scoreNodes() {
        throw new NotImplementedException();
    }

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

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#sort">Stream Decorator Reference: sort</a>
     * @param stream
     * @param by
     * @return
     */
    public static StreamExpression sort(StreamExpression stream, By by) {
        return new StreamExpression("sort")
            .withParameter(stream)
            .withParameter(by);
    }

    /**
     * @see <ahref="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#top">Stream Decorator Reference: top</a>
     * @param n
     * @param stream
     * @param sort
     * @return
     */
    public static StreamExpression top(N n, StreamExpression stream, Sort sort) {
        return new StreamExpression("top")
            .withParameter(n)
            .withParameter(stream)
            .withParameter(sort);
    }

    public static StreamExpression unique() {
        throw new NotImplementedException();
    }

    public static StreamExpression update() {
        throw new NotImplementedException();
    }

}
