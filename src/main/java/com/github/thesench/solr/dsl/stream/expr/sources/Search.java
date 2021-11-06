package com.github.thesench.solr.dsl.stream.expr.sources;

import com.github.thesench.solr.dsl.stream.expr.params.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class Search {
    private Search() {}

    /**
     * @see <a href="https://solr.apache.org/guide/8_10/stream-source-reference.html#search">Stream Source Reference: search</a>
     * @param collectionName
     * @param params
     * @return
     */
    public static StreamExpression search(String collectionName, SearchParameter ...params) {
        StreamExpression searchExpression = new StreamExpression("search").withParameter(collectionName);
        for (SearchParameter param : params) {
            searchExpression.addParameter(param);
        }
        return searchExpression;
    }
}
