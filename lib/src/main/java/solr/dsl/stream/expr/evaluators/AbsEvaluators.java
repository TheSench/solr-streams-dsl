package solr.dsl.stream.expr.evaluators;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;

public class AbsEvaluators {
    public static EvaluatorStreamExpression abs(String fieldName) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(fieldName);
        return (EvaluatorStreamExpression) expression;
    }

    public static EvaluatorStreamExpression abs(int rawNumber) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(Integer.toString(rawNumber));
        return (EvaluatorStreamExpression) expression;
    }

    public static EvaluatorStreamExpression abs(short rawNumber) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(Short.toString(rawNumber));
        return (EvaluatorStreamExpression) expression;
    }

    public static EvaluatorStreamExpression abs(long rawNumber) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(Long.toString(rawNumber));
        return (EvaluatorStreamExpression) expression;
    }

    public static EvaluatorStreamExpression abs(double rawNumber) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(Double.toString(rawNumber));
        return (EvaluatorStreamExpression) expression;
    }

    public static EvaluatorStreamExpression abs(float rawNumber) {
        StreamExpression expression = new EvaluatorStreamExpression("abs").withParameter(Float.toString(rawNumber));
        return (EvaluatorStreamExpression) expression;
    }
}
