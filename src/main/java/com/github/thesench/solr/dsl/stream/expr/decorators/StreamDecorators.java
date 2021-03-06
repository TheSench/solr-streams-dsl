package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.params.By;
import com.github.thesench.solr.dsl.stream.expr.params.N;
import com.github.thesench.solr.dsl.stream.expr.params.Reducer;
import com.github.thesench.solr.dsl.stream.expr.params.Sort;

import org.apache.commons.lang.NotImplementedException;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class StreamDecorators {
    private StreamDecorators() {}

    public static StreamExpression classify() {
        throw new NotImplementedException();
    }

    public static StreamExpression commit() {
        throw new NotImplementedException();
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
    
    public static StreamExpression having() {
        throw new NotImplementedException();
    }

    public static StreamExpression merge() {
        throw new NotImplementedException();
    }

    public static StreamExpression null_() {
        throw new NotImplementedException();
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
