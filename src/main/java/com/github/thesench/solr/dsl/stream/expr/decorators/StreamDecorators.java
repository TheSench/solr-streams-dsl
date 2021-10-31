package com.github.thesench.solr.dsl.stream.expr.decorators;

import com.github.thesench.solr.dsl.stream.expr.evaluators.EvaluatorStreamExpression;
import com.github.thesench.solr.dsl.stream.expr.params.BatchSize;
import com.github.thesench.solr.dsl.stream.expr.params.FL;
import com.github.thesench.solr.dsl.stream.expr.params.On;
import com.github.thesench.solr.dsl.stream.expr.params.ProductSort;

import org.apache.commons.lang.NotImplementedException;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class StreamDecorators {
    private StreamDecorators() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param fieldName
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param fieldName
     * @param productSort
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, String fieldName, ProductSort productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(fieldName)
            .withParameter(productSort);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param evaluator
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator);
    }
    
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-decorator-reference.html#cartesianproduct">Stream Decorator Reference: cartesianProduct</a>
     * @param incomingStream
     * @param evaluator
     * @param productSort
     * @return
     */
    public static StreamExpression cartesianProduct(StreamExpression incomingStream, EvaluatorStreamExpression evaluator, ProductSort productSort) {
        return new StreamExpression("cartesianProduct")
            .withParameter(incomingStream)
            .withParameter(evaluator)
            .withParameter(productSort);
    }

    public static StreamExpression classify() {
        throw new NotImplementedException();
    }

    public static StreamExpression commit() {
        throw new NotImplementedException();
    }

    public static StreamExpression complement() {
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

    public static StreamExpression having() {
        throw new NotImplementedException();
    }

    public static StreamExpression intersect() {
        throw new NotImplementedException();
    }

    public static StreamExpression list() {
        throw new NotImplementedException();
    }

    public static StreamExpression merge() {
        throw new NotImplementedException();
    }

    // public static StreamExpression null() {
    //     throw new NotImplementedException();
    // }

    public static StreamExpression parallel() {
        throw new NotImplementedException();
    }

    public static StreamExpression plist() {
        throw new NotImplementedException();
    }

    public static StreamExpression priority() {
        throw new NotImplementedException();
    }

    public static StreamExpression reduce() {
        throw new NotImplementedException();
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

    public static StreamExpression sort() {
        throw new NotImplementedException();
    }

    public static StreamExpression top() {
        throw new NotImplementedException();
    }

    public static StreamExpression unique() {
        throw new NotImplementedException();
    }

    public static StreamExpression update() {
        throw new NotImplementedException();
    }

}
