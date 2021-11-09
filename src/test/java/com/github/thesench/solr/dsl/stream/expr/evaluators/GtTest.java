package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Gt.gt;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class GtTest {
    
    @Test
    void gt_givenFieldAndField_returnsGtExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");

        StreamExpression expression = gt(left, right);

        assertEquals("gt(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void gt_givenFieldAndEvaluator_returnsGtExpression() {
        Field left = new Field("someField");
        Evaluator right = abs(-1);

        StreamExpression expression = gt(left, right);

        assertEquals("gt(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void gt_givenFieldAndInt_returnsGtExpression() {
        Field left = new Field("someField");
        int right = 4;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(someField,4)", expression.toString());
    }
    
    @Test
    void gt_givenFieldAndFloat_returnsGtExpression() {
        Field left = new Field("someField");
        float right = 3.4f;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(someField,3.4)", expression.toString());
    }
    
    @Test
    void gt_givenFieldAndDouble_returnsGtExpression() {
        Field left = new Field("someField");
        double right = 1.2d;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(someField,1.2)", expression.toString());
    }
    
    @Test
    void gt_givenEvaluatorAndField_returnsGtExpression() {
        Evaluator left = abs(-1);
        Field right = new Field("someOtherField");

        StreamExpression expression = gt(left, right);

        assertEquals("gt(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void gt_givenEvaluatorAndEvaluator_returnsGtExpression() {
        Evaluator left = abs(-1);
        Evaluator right = abs(-1);

        StreamExpression expression = gt(left, right);

        assertEquals("gt(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void gt_givenEvaluatorAndInt_returnsGtExpression() {
        Evaluator left = abs(-1);
        int right = 4;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(abs(-1),4)", expression.toString());
    }
    
    @Test
    void gt_givenEvaluatorAndFloat_returnsGtExpression() {
        Evaluator left = abs(-1);
        float right = 3.4f;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void gt_givenEvaluatorAndDouble_returnsGtExpression() {
        Evaluator left = abs(-1);
        double right = 1.2d;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void gt_givenIntAndField_returnsGtExpression() {
        int left = 4;
        Field right = new Field("someOtherField");

        StreamExpression expression = gt(left, right);

        assertEquals("gt(4,someOtherField)", expression.toString());
    }
    
    @Test
    void gt_givenIntAndEvaluator_returnsGtExpression() {
        int left = 4;
        Evaluator right = abs(-1);

        StreamExpression expression = gt(left, right);

        assertEquals("gt(4,abs(-1))", expression.toString());
    }
    
    @Test
    void gt_givenIntAndInt_returnsGtExpression() {
        int left = 4;
        int right = 4;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(4,4)", expression.toString());
    }
    
    @Test
    void gt_givenIntAndFloat_returnsGtExpression() {
        int left = 4;
        float right = 3.4f;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(4,3.4)", expression.toString());
    }
    
    @Test
    void gt_givenIntAndDouble_returnsGtExpression() {
        int left = 4;
        double right = 1.2d;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(4,1.2)", expression.toString());
    }
    
    @Test
    void gt_givenFloatAndField_returnsGtExpression() {
        float left = 3.4f;
        Field right = new Field("someOtherField");

        StreamExpression expression = gt(left, right);

        assertEquals("gt(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void gt_givenFloatAndEvaluator_returnsGtExpression() {
        float left = 3.4f;
        Evaluator right = abs(-1);

        StreamExpression expression = gt(left, right);

        assertEquals("gt(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void gt_givenFloatAndInt_returnsGtExpression() {
        float left = 3.4f;
        int right = 4;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(3.4,4)", expression.toString());
    }
    
    @Test
    void gt_givenFloatAndFloat_returnsGtExpression() {
        float left = 3.4f;
        float right = 3.4f;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(3.4,3.4)", expression.toString());
    }
    
    @Test
    void gt_givenFloatAndDouble_returnsGtExpression() {
        float left = 3.4f;
        double right = 1.2d;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(3.4,1.2)", expression.toString());
    }
    
    @Test
    void gt_givenDoubleAndField_returnsGtExpression() {
        double left = 1.2d;
        Field right = new Field("someOtherField");

        StreamExpression expression = gt(left, right);

        assertEquals("gt(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void gt_givenDoubleAndEvaluator_returnsGtExpression() {
        double left = 1.2d;
        Evaluator right = abs(-1);

        StreamExpression expression = gt(left, right);

        assertEquals("gt(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void gt_givenDoubleAndInt_returnsGtExpression() {
        double left = 1.2d;
        int right = 4;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(1.2,4)", expression.toString());
    }
    
    @Test
    void gt_givenDoubleAndFloat_returnsGtExpression() {
        double left = 1.2d;
        float right = 3.4f;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(1.2,3.4)", expression.toString());
    }
    
    @Test
    void gt_givenDoubleAndDouble_returnsGtExpression() {
        double left = 1.2d;
        double right = 1.2d;

        StreamExpression expression = gt(left, right);

        assertEquals("gt(1.2,1.2)", expression.toString());
    }    
}
