package solr.dsl.stream.expr.sources;

import java.util.Arrays;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.common.params.CommonParams;

public class SearchStreams {
    public StreamExpression search(String collectionName, StreamExpressionSearchParameter ...params) {
        return new StreamExpression("search")
            .withParameter(collectionName)
            .withParameters(Arrays.asList(params));
    }

    public StreamExpressionSearchParameter q(String query) {
        return new StreamExpressionSearchParameter(CommonParams.Q, query);
    }

    public StreamExpressionSearchParameter sort(SortField sortField) {
        return new StreamExpressionSearchParameter(CommonParams.SORT, sortField.toString());
    }

    public StreamExpressionSearchParameter sort(String sorts) {
        return new StreamExpressionSearchParameter(CommonParams.SORT, sorts);
    }

    public StreamExpressionSearchParameter fl(String ...fields) {
        return new StreamExpressionSearchParameter(CommonParams.FL, String.join(",", fields));
    }

    public StreamExpressionSearchParameter rows(int numRows) {
        return new StreamExpressionSearchParameter(CommonParams.ROWS, Integer.toString(numRows));
    }

    public StreamExpressionSearchParameter qt(RequestHandler requsetHandler) {
        return new StreamExpressionSearchParameter(CommonParams.QT, requsetHandler.toString());
    }

    public StreamExpressionSearchParameter raw(String name, String value) {
        return new StreamExpressionSearchParameter(name, value);
    }
}
