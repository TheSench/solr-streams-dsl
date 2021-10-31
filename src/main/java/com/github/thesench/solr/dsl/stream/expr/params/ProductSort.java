package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class ProductSort extends StreamExpressionNamedParameter {
    
    public ProductSort(String sorts) {
        super("productSort", sorts);
    }
}
