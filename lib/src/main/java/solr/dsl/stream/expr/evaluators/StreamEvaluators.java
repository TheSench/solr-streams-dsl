package solr.dsl.stream.expr.evaluators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class StreamEvaluators {
    public StreamExpression abs(String fieldName) {
        return new StreamExpression("abs")
            .withParameter(fieldName);
    }

    public StreamExpression abs(int rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Integer.toString(rawNumber));
    }

    public StreamExpression abs(double rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Double.toString(rawNumber));
    }
}
