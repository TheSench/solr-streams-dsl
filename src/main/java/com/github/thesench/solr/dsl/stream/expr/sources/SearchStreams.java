package com.github.thesench.solr.dsl.stream.expr.sources;

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

    public static StreamExpressionSearchParameter q(String query) {
        return new StreamExpressionSearchParameter(CommonParams.Q, query);
    }

    public static StreamExpressionSearchParameter fq(String filterQuery) {
        return new StreamExpressionSearchParameter(CommonParams.FQ, filterQuery);
    }

    public static StreamExpressionSearchParameter rows(int numRows) {
        return new StreamExpressionSearchParameter(CommonParams.ROWS, Integer.toString(numRows));
    }

    public static StreamExpressionSearchParameter qt(RequestHandler requestHandler) {
        return new StreamExpressionSearchParameter(CommonParams.QT, requestHandler.toString());
    }

    public static StreamExpressionSearchParameter raw(String name, String value) {
        return new StreamExpressionSearchParameter(name, value);
    }
}
