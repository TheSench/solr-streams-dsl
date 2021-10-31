package com.github.thesench.solr.dsl.stream.expr.sources;

import org.apache.commons.lang.NotImplementedException;
import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class StreamSources {
    private StreamSources() {}

    public static StreamExpression jdbc() {
        throw new NotImplementedException();
    }

    public static StreamExpression drill() {
        throw new NotImplementedException();
    }

    public static StreamExpression echo() {
        throw new NotImplementedException();
    }

    public static StreamExpression facet() {
        throw new NotImplementedException();
    }

    public static StreamExpression features() {
        throw new NotImplementedException();
    }

    public static StreamExpression cat() {
        throw new NotImplementedException();
    }

    public static StreamExpression nodes() {
        throw new NotImplementedException();
    }

    public static StreamExpression knnSearch() {
        throw new NotImplementedException();
    }

    public static StreamExpression model() {
        throw new NotImplementedException();
    }

    public static StreamExpression random() {
        throw new NotImplementedException();
    }

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

    public static StreamExpression significantTerms() {
        throw new NotImplementedException();
    }

    public static StreamExpression shortestPath() {
        throw new NotImplementedException();
    }

    public static StreamExpression shuffle() {
        throw new NotImplementedException();
    }

    public static StreamExpression stats() {
        throw new NotImplementedException();
    }

    public static StreamExpression timeseries() {
        throw new NotImplementedException();
    }

    public static StreamExpression train() {
        throw new NotImplementedException();
    }

    public static StreamExpression topic() {
        throw new NotImplementedException();
    }

    public static StreamExpression tuple() {
        throw new NotImplementedException();
    }

}
