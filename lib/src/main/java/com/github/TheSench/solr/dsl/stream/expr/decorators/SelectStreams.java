package com.github.TheSench.solr.dsl.stream.expr.decorators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class SelectStreams {
    public static StreamExpression select(StreamExpression stream, String ...fields) {
        StreamExpression selectStream = new StreamExpression("select")
            .withParameter(stream);
        for (String field : fields) {
            selectStream.addParameter(field);
        }
        return selectStream;
    }
}
