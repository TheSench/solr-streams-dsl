package com.github.thesench.solr.dsl.stream.expr.params;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;

public class ProductSort extends StreamExpressionNamedParameter {
    
    public ProductSort(String sorts) {
        super("productSort", sorts);
    }

    public static ProductSort productSort(SortedField firstSortedField, SortedField... otherSortedFields) {
        StringBuilder sb = new StringBuilder();
        firstSortedField.appendSelf(sb);
        for(SortedField sortedField : otherSortedFields) {
            sb.append(',');
            sortedField.appendSelf(sb);
        }
        return new ProductSort(sb.toString());
    }

    public static ProductSort productSort(String sort) {
        return new ProductSort(sort);
    }

    public static ProductSort productSort(String... sorts) {
        return new ProductSort(String.join(",", sorts));
    }
}
