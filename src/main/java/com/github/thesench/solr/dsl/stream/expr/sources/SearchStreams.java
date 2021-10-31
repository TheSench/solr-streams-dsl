package com.github.thesench.solr.dsl.stream.expr.sources;

import com.github.thesench.solr.dsl.stream.expr.params.RequestHandler;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.common.params.CommonParams;

public class SearchStreams {
    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-source-reference.html#search">Stream Source Reference: search</a>
     * @param collectionName
     * @param params
     * @return
     */
    public static StreamExpression search(String collectionName, StreamExpressionSearchParameter ...params) {
        StreamExpression searchExpression = new StreamExpression("search").withParameter(collectionName);
        for (StreamExpressionSearchParameter param : params) {
            searchExpression.addParameter(param);
        }
        return searchExpression;
    }
}
