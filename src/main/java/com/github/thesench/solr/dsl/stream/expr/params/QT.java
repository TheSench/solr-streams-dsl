package com.github.thesench.solr.dsl.stream.expr.params;

import com.github.thesench.solr.dsl.stream.expr.sources.SearchParameter;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpressionNamedParameter;
import org.apache.solr.common.params.CommonParams;

public class QT extends StreamExpressionNamedParameter implements SearchParameter {
    public QT(RequestHandler requestHandler) {
        super(CommonParams.QT, requestHandler.toString());
    }

    public static QT qt(RequestHandler requestHandler) {
        return new QT(requestHandler);
    }
}
