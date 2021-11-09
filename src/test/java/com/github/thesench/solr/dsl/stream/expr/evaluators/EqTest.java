package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Eq.eq;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class EqTest {
    
    @Test
    void eq_givenMultipleFieldsAndEvaluators_returnsEqExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");
        Field field3 = new Field("field3");
        Field field4 = new Field("field4");
        Field field5 = new Field("field5");

        StreamExpression expression = eq(left, right, Add.add(field3, field4), field5);

        assertEquals("eq(someField,someOtherField,add(field3,field4),field5)", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndField_returnsEqExpression() {
        Field left = new Field("someField");
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndEvaluator_returnsEqExpression() {
        Field left = new Field("someField");
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndInt_returnsEqExpression() {
        Field left = new Field("someField");
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,4)", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndFloat_returnsEqExpression() {
        Field left = new Field("someField");
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,3.4)", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndBoolean_returnsEqExpression() {
        Field left = new Field("someField");
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,true)", expression.toString());
    }
    
    @Test
    void eq_givenFieldAndDouble_returnsEqExpression() {
        Field left = new Field("someField");
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(someField,1.2)", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndField_returnsEqExpression() {
        Evaluator left = abs(-1);
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndEvaluator_returnsEqExpression() {
        Evaluator left = abs(-1);
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndInt_returnsEqExpression() {
        Evaluator left = abs(-1);
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),4)", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndFloat_returnsEqExpression() {
        Evaluator left = abs(-1);
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndBoolean_returnsEqExpression() {
        Evaluator left = abs(-1);
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),true)", expression.toString());
    }
    
    @Test
    void eq_givenEvaluatorAndDouble_returnsEqExpression() {
        Evaluator left = abs(-1);
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void eq_givenIntAndField_returnsEqExpression() {
        int left = 4;
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenIntAndEvaluator_returnsEqExpression() {
        int left = 4;
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenIntAndInt_returnsEqExpression() {
        int left = 4;
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,4)", expression.toString());
    }
    
    @Test
    void eq_givenIntAndFloat_returnsEqExpression() {
        int left = 4;
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,3.4)", expression.toString());
    }
    
    @Test
    void eq_givenIntAndBoolean_returnsEqExpression() {
        int left = 4;
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,true)", expression.toString());
    }
    
    @Test
    void eq_givenIntAndDouble_returnsEqExpression() {
        int left = 4;
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(4,1.2)", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndField_returnsEqExpression() {
        float left = 3.4f;
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndEvaluator_returnsEqExpression() {
        float left = 3.4f;
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndInt_returnsEqExpression() {
        float left = 3.4f;
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,4)", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndFloat_returnsEqExpression() {
        float left = 3.4f;
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,3.4)", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndBoolean_returnsEqExpression() {
        float left = 3.4f;
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,true)", expression.toString());
    }
    
    @Test
    void eq_givenFloatAndDouble_returnsEqExpression() {
        float left = 3.4f;
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(3.4,1.2)", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndField_returnsEqExpression() {
        boolean left = false;
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndEvaluator_returnsEqExpression() {
        boolean left = false;
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndInt_returnsEqExpression() {
        boolean left = false;
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,4)", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndFloat_returnsEqExpression() {
        boolean left = false;
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,3.4)", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndBoolean_returnsEqExpression() {
        boolean left = false;
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,true)", expression.toString());
    }
    
    @Test
    void eq_givenBooleanAndDouble_returnsEqExpression() {
        boolean left = false;
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(false,1.2)", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndField_returnsEqExpression() {
        double left = 1.2d;
        Field right = new Field("someOtherField");

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndEvaluator_returnsEqExpression() {
        double left = 1.2d;
        Evaluator right = abs(-1);

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndInt_returnsEqExpression() {
        double left = 1.2d;
        int right = 4;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,4)", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndFloat_returnsEqExpression() {
        double left = 1.2d;
        float right = 3.4f;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,3.4)", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndBoolean_returnsEqExpression() {
        double left = 1.2d;
        boolean right = true;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,true)", expression.toString());
    }
    
    @Test
    void eq_givenDoubleAndDouble_returnsEqExpression() {
        double left = 1.2d;
        double right = 1.2d;

        StreamExpression expression = eq(left, right);

        assertEquals("eq(1.2,1.2)", expression.toString());
    }    
}
