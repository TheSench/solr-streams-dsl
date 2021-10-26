package solr.dsl.stream.expr.sources;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.apache.solr.common.params.CommonParams;

public class SearchStreams {
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

    public static StreamExpressionSearchParameter sort(SortFields sortField) {
        return new StreamExpressionSearchParameter(CommonParams.SORT, sortField.toString());
    }

    public static StreamExpressionSearchParameter sort(String sorts) {
        return new StreamExpressionSearchParameter(CommonParams.SORT, sorts);
    }

    public static StreamExpressionSearchParameter fl(String ...fields) {
        return new StreamExpressionSearchParameter(CommonParams.FL, String.join(",", fields));
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
