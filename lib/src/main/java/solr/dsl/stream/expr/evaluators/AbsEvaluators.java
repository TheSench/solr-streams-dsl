package solr.dsl.stream.expr.evaluators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class AbsEvaluators {
    public static StreamExpression abs(String fieldName) {
        return new StreamExpression("abs")
            .withParameter(fieldName);
    }

    public static StreamExpression abs(int rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Integer.toString(rawNumber));
    }

    public static StreamExpression abs(short rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Short.toString(rawNumber));
    }

    public static StreamExpression abs(long rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Long.toString(rawNumber));
    }

    public static StreamExpression abs(double rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Double.toString(rawNumber));
    }

    public static StreamExpression abs(float rawNumber) {
        return new StreamExpression("abs")
            .withParameter(Float.toString(rawNumber));
    }
}
