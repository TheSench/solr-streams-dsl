package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Lt.lt;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class LtTest {
    
    @Test
    void lt_givenFieldAndField_returnsLtExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");

        StreamExpression expression = lt(left, right);

        assertEquals("lt(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void lt_givenFieldAndEvaluator_returnsLtExpression() {
        Field left = new Field("someField");
        Evaluator right = abs(-1);

        StreamExpression expression = lt(left, right);

        assertEquals("lt(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void lt_givenFieldAndInt_returnsLtExpression() {
        Field left = new Field("someField");
        int right = 4;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(someField,4)", expression.toString());
    }
    
    @Test
    void lt_givenFieldAndFloat_returnsLtExpression() {
        Field left = new Field("someField");
        float right = 3.4f;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(someField,3.4)", expression.toString());
    }
    
    @Test
    void lt_givenFieldAndDouble_returnsLtExpression() {
        Field left = new Field("someField");
        double right = 1.2d;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(someField,1.2)", expression.toString());
    }
    
    @Test
    void lt_givenEvaluatorAndField_returnsLtExpression() {
        Evaluator left = abs(-1);
        Field right = new Field("someOtherField");

        StreamExpression expression = lt(left, right);

        assertEquals("lt(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void lt_givenEvaluatorAndEvaluator_returnsLtExpression() {
        Evaluator left = abs(-1);
        Evaluator right = abs(-1);

        StreamExpression expression = lt(left, right);

        assertEquals("lt(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void lt_givenEvaluatorAndInt_returnsLtExpression() {
        Evaluator left = abs(-1);
        int right = 4;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(abs(-1),4)", expression.toString());
    }
    
    @Test
    void lt_givenEvaluatorAndFloat_returnsLtExpression() {
        Evaluator left = abs(-1);
        float right = 3.4f;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void lt_givenEvaluatorAndDouble_returnsLtExpression() {
        Evaluator left = abs(-1);
        double right = 1.2d;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void lt_givenIntAndField_returnsLtExpression() {
        int left = 4;
        Field right = new Field("someOtherField");

        StreamExpression expression = lt(left, right);

        assertEquals("lt(4,someOtherField)", expression.toString());
    }
    
    @Test
    void lt_givenIntAndEvaluator_returnsLtExpression() {
        int left = 4;
        Evaluator right = abs(-1);

        StreamExpression expression = lt(left, right);

        assertEquals("lt(4,abs(-1))", expression.toString());
    }
    
    @Test
    void lt_givenIntAndInt_returnsLtExpression() {
        int left = 4;
        int right = 4;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(4,4)", expression.toString());
    }
    
    @Test
    void lt_givenIntAndFloat_returnsLtExpression() {
        int left = 4;
        float right = 3.4f;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(4,3.4)", expression.toString());
    }
    
    @Test
    void lt_givenIntAndDouble_returnsLtExpression() {
        int left = 4;
        double right = 1.2d;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(4,1.2)", expression.toString());
    }
    
    @Test
    void lt_givenFloatAndField_returnsLtExpression() {
        float left = 3.4f;
        Field right = new Field("someOtherField");

        StreamExpression expression = lt(left, right);

        assertEquals("lt(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void lt_givenFloatAndEvaluator_returnsLtExpression() {
        float left = 3.4f;
        Evaluator right = abs(-1);

        StreamExpression expression = lt(left, right);

        assertEquals("lt(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void lt_givenFloatAndInt_returnsLtExpression() {
        float left = 3.4f;
        int right = 4;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(3.4,4)", expression.toString());
    }
    
    @Test
    void lt_givenFloatAndFloat_returnsLtExpression() {
        float left = 3.4f;
        float right = 3.4f;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(3.4,3.4)", expression.toString());
    }
    
    @Test
    void lt_givenFloatAndDouble_returnsLtExpression() {
        float left = 3.4f;
        double right = 1.2d;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(3.4,1.2)", expression.toString());
    }
    
    @Test
    void lt_givenDoubleAndField_returnsLtExpression() {
        double left = 1.2d;
        Field right = new Field("someOtherField");

        StreamExpression expression = lt(left, right);

        assertEquals("lt(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void lt_givenDoubleAndEvaluator_returnsLtExpression() {
        double left = 1.2d;
        Evaluator right = abs(-1);

        StreamExpression expression = lt(left, right);

        assertEquals("lt(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void lt_givenDoubleAndInt_returnsLtExpression() {
        double left = 1.2d;
        int right = 4;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(1.2,4)", expression.toString());
    }
    
    @Test
    void lt_givenDoubleAndFloat_returnsLtExpression() {
        double left = 1.2d;
        float right = 3.4f;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(1.2,3.4)", expression.toString());
    }
    
    @Test
    void lt_givenDoubleAndDouble_returnsLtExpression() {
        double left = 1.2d;
        double right = 1.2d;

        StreamExpression expression = lt(left, right);

        assertEquals("lt(1.2,1.2)", expression.toString());
    }    
}
