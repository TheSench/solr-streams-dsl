package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Lteq.lteq;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class LteqTest {
    
    @Test
    void lteq_givenFieldAndField_returnsLteqExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void lteq_givenFieldAndEvaluator_returnsLteqExpression() {
        Field left = new Field("someField");
        Evaluator right = abs(-1);

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void lteq_givenFieldAndInt_returnsLteqExpression() {
        Field left = new Field("someField");
        int right = 4;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(someField,4)", expression.toString());
    }
    
    @Test
    void lteq_givenFieldAndFloat_returnsLteqExpression() {
        Field left = new Field("someField");
        float right = 3.4f;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(someField,3.4)", expression.toString());
    }
    
    @Test
    void lteq_givenFieldAndDouble_returnsLteqExpression() {
        Field left = new Field("someField");
        double right = 1.2d;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(someField,1.2)", expression.toString());
    }
    
    @Test
    void lteq_givenEvaluatorAndField_returnsLteqExpression() {
        Evaluator left = abs(-1);
        Field right = new Field("someOtherField");

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void lteq_givenEvaluatorAndEvaluator_returnsLteqExpression() {
        Evaluator left = abs(-1);
        Evaluator right = abs(-1);

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void lteq_givenEvaluatorAndInt_returnsLteqExpression() {
        Evaluator left = abs(-1);
        int right = 4;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(abs(-1),4)", expression.toString());
    }
    
    @Test
    void lteq_givenEvaluatorAndFloat_returnsLteqExpression() {
        Evaluator left = abs(-1);
        float right = 3.4f;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void lteq_givenEvaluatorAndDouble_returnsLteqExpression() {
        Evaluator left = abs(-1);
        double right = 1.2d;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void lteq_givenIntAndField_returnsLteqExpression() {
        int left = 4;
        Field right = new Field("someOtherField");

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(4,someOtherField)", expression.toString());
    }
    
    @Test
    void lteq_givenIntAndEvaluator_returnsLteqExpression() {
        int left = 4;
        Evaluator right = abs(-1);

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(4,abs(-1))", expression.toString());
    }
    
    @Test
    void lteq_givenIntAndInt_returnsLteqExpression() {
        int left = 4;
        int right = 4;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(4,4)", expression.toString());
    }
    
    @Test
    void lteq_givenIntAndFloat_returnsLteqExpression() {
        int left = 4;
        float right = 3.4f;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(4,3.4)", expression.toString());
    }
    
    @Test
    void lteq_givenIntAndDouble_returnsLteqExpression() {
        int left = 4;
        double right = 1.2d;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(4,1.2)", expression.toString());
    }
    
    @Test
    void lteq_givenFloatAndField_returnsLteqExpression() {
        float left = 3.4f;
        Field right = new Field("someOtherField");

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void lteq_givenFloatAndEvaluator_returnsLteqExpression() {
        float left = 3.4f;
        Evaluator right = abs(-1);

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void lteq_givenFloatAndInt_returnsLteqExpression() {
        float left = 3.4f;
        int right = 4;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(3.4,4)", expression.toString());
    }
    
    @Test
    void lteq_givenFloatAndFloat_returnsLteqExpression() {
        float left = 3.4f;
        float right = 3.4f;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(3.4,3.4)", expression.toString());
    }
    
    @Test
    void lteq_givenFloatAndDouble_returnsLteqExpression() {
        float left = 3.4f;
        double right = 1.2d;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(3.4,1.2)", expression.toString());
    }
    
    @Test
    void lteq_givenDoubleAndField_returnsLteqExpression() {
        double left = 1.2d;
        Field right = new Field("someOtherField");

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void lteq_givenDoubleAndEvaluator_returnsLteqExpression() {
        double left = 1.2d;
        Evaluator right = abs(-1);

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void lteq_givenDoubleAndInt_returnsLteqExpression() {
        double left = 1.2d;
        int right = 4;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(1.2,4)", expression.toString());
    }
    
    @Test
    void lteq_givenDoubleAndFloat_returnsLteqExpression() {
        double left = 1.2d;
        float right = 3.4f;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(1.2,3.4)", expression.toString());
    }
    
    @Test
    void lteq_givenDoubleAndDouble_returnsLteqExpression() {
        double left = 1.2d;
        double right = 1.2d;

        StreamExpression expression = lteq(left, right);

        assertEquals("lteq(1.2,1.2)", expression.toString());
    }    
}
