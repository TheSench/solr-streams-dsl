package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Gteq.gteq;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class GteqTest {
    
    @Test
    void gteq_givenFieldAndField_returnsGteqExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void gteq_givenFieldAndEvaluator_returnsGteqExpression() {
        Field left = new Field("someField");
        Evaluator right = abs(-1);

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void gteq_givenFieldAndInt_returnsGteqExpression() {
        Field left = new Field("someField");
        int right = 4;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(someField,4)", expression.toString());
    }
    
    @Test
    void gteq_givenFieldAndFloat_returnsGteqExpression() {
        Field left = new Field("someField");
        float right = 3.4f;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(someField,3.4)", expression.toString());
    }
    
    @Test
    void gteq_givenFieldAndDouble_returnsGteqExpression() {
        Field left = new Field("someField");
        double right = 1.2d;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(someField,1.2)", expression.toString());
    }
    
    @Test
    void gteq_givenEvaluatorAndField_returnsGteqExpression() {
        Evaluator left = abs(-1);
        Field right = new Field("someOtherField");

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void gteq_givenEvaluatorAndEvaluator_returnsGteqExpression() {
        Evaluator left = abs(-1);
        Evaluator right = abs(-1);

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void gteq_givenEvaluatorAndInt_returnsGteqExpression() {
        Evaluator left = abs(-1);
        int right = 4;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(abs(-1),4)", expression.toString());
    }
    
    @Test
    void gteq_givenEvaluatorAndFloat_returnsGteqExpression() {
        Evaluator left = abs(-1);
        float right = 3.4f;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void gteq_givenEvaluatorAndDouble_returnsGteqExpression() {
        Evaluator left = abs(-1);
        double right = 1.2d;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void gteq_givenIntAndField_returnsGteqExpression() {
        int left = 4;
        Field right = new Field("someOtherField");

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(4,someOtherField)", expression.toString());
    }
    
    @Test
    void gteq_givenIntAndEvaluator_returnsGteqExpression() {
        int left = 4;
        Evaluator right = abs(-1);

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(4,abs(-1))", expression.toString());
    }
    
    @Test
    void gteq_givenIntAndInt_returnsGteqExpression() {
        int left = 4;
        int right = 4;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(4,4)", expression.toString());
    }
    
    @Test
    void gteq_givenIntAndFloat_returnsGteqExpression() {
        int left = 4;
        float right = 3.4f;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(4,3.4)", expression.toString());
    }
    
    @Test
    void gteq_givenIntAndDouble_returnsGteqExpression() {
        int left = 4;
        double right = 1.2d;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(4,1.2)", expression.toString());
    }
    
    @Test
    void gteq_givenFloatAndField_returnsGteqExpression() {
        float left = 3.4f;
        Field right = new Field("someOtherField");

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void gteq_givenFloatAndEvaluator_returnsGteqExpression() {
        float left = 3.4f;
        Evaluator right = abs(-1);

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void gteq_givenFloatAndInt_returnsGteqExpression() {
        float left = 3.4f;
        int right = 4;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(3.4,4)", expression.toString());
    }
    
    @Test
    void gteq_givenFloatAndFloat_returnsGteqExpression() {
        float left = 3.4f;
        float right = 3.4f;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(3.4,3.4)", expression.toString());
    }
    
    @Test
    void gteq_givenFloatAndDouble_returnsGteqExpression() {
        float left = 3.4f;
        double right = 1.2d;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(3.4,1.2)", expression.toString());
    }
    
    @Test
    void gteq_givenDoubleAndField_returnsGteqExpression() {
        double left = 1.2d;
        Field right = new Field("someOtherField");

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void gteq_givenDoubleAndEvaluator_returnsGteqExpression() {
        double left = 1.2d;
        Evaluator right = abs(-1);

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void gteq_givenDoubleAndInt_returnsGteqExpression() {
        double left = 1.2d;
        int right = 4;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(1.2,4)", expression.toString());
    }
    
    @Test
    void gteq_givenDoubleAndFloat_returnsGteqExpression() {
        double left = 1.2d;
        float right = 3.4f;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(1.2,3.4)", expression.toString());
    }
    
    @Test
    void gteq_givenDoubleAndDouble_returnsGteqExpression() {
        double left = 1.2d;
        double right = 1.2d;

        StreamExpression expression = gteq(left, right);

        assertEquals("gteq(1.2,1.2)", expression.toString());
    }    
}
