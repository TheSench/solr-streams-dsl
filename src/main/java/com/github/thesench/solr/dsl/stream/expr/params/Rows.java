package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class Rows extends StreamExpressionNamedParameter implements SearchParameter {
    public Rows(int rows) {
        super(CommonParams.ROWS, Integer.toString(rows));
    }

    public static Rows rows(int numRows) {
        return new Rows(numRows);
    }
}
