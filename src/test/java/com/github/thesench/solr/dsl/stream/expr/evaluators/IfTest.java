package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.params.FieldOrEvaluator;

import org.junit.jupiter.api.Test;

public class IfTest {

    @Test 
    void if_givenField_andField_andEvaluator_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,abs(-1))", evaluator.toString());
    }

    @Test 
    void if_givenField_andFieldOrEvaluator_andEvaluator_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),abs(-1))", evaluator.toString());
    }

    @Test 
    void if_givenField_andField_andField_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,anotherField)", evaluator.toString());
    }

    @Test 
    void if_givenField_andFieldOrEvaluator_andField_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),anotherField)", evaluator.toString());
    }

    @Test 
    void if_givenBooleanEvaluator_andField_andEvaluator_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,abs(-1))", evaluator.toString());
    }

    @Test 
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andEvaluator_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),abs(-1))", evaluator.toString());
    }

    @Test 
    void if_givenBooleanEvaluator_andField_andField_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,anotherField)", evaluator.toString());
    }

    @Test 
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andField_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),anotherField)", evaluator.toString());
    }

    @Test
    void if_givenField_andField_andInt_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,4)", evaluator.toString());
    }

    @Test
    void if_givenField_andFieldOrEvaluator_andInt_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andField_andInt_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andInt_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),4)", evaluator.toString());
    }

    @Test
    void if_givenField_andField_andFloat_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,3.4)", evaluator.toString());
    }

    @Test
    void if_givenField_andFieldOrEvaluator_andFloat_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),3.4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andField_andFloat_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andFloat_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),3.4)", evaluator.toString());
    }

    @Test
    void if_givenField_andField_andDouble_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,2.7)", evaluator.toString());
    }

    @Test
    void if_givenField_andFieldOrEvaluator_andDouble_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),2.7)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andField_andDouble_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andDouble_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),2.7)", evaluator.toString());
    }

    @Test
    void if_givenField_andField_andString_returnsIfExpression() {
        Field condition = new Field("someField");
        Field whenTrue = new Field("someOtherField");
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someOtherField,someString)", evaluator.toString());
    }

    @Test
    void if_givenField_andFieldOrEvaluator_andString_returnsIfExpression() {
        Field condition = new Field("someField");
        FieldOrEvaluator whenTrue = Add.add(1,1);
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,add(1,1),someString)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andField_andString_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        Field whenTrue = new Field("someOtherField");
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someOtherField,someString)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andFieldOrEvaluator_andString_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        FieldOrEvaluator whenTrue = Add.add(1,1);
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),add(1,1),someString)", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andEvaluator_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andField_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andEvaluator_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andField_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andInt_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andInt_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,4)", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andFloat_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andFloat_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,3.4)", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andDouble_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andDouble_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,2.7)", evaluator.toString());
    }

    @Test
    void if_givenField_andInt_andString_returnsIfExpression() {
        Field condition = new Field("someField");
        int whenTrue = 4;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,4,someString)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andInt_andString_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        int whenTrue = 4;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),4,someString)", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andEvaluator_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andField_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andEvaluator_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andField_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andInt_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andInt_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,4)", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andFloat_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andFloat_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,3.4)", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andDouble_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andDouble_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,2.7)", evaluator.toString());
    }

    @Test
    void if_givenField_andDouble_andString_returnsIfExpression() {
        Field condition = new Field("someField");
        double whenTrue = 2.7d;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,2.7,someString)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andDouble_andString_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        double whenTrue = 2.7d;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),2.7,someString)", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andEvaluator_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andField_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andEvaluator_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andField_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andInt_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andInt_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,4)", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andFloat_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andFloat_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,3.4)", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andDouble_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andDouble_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,2.7)", evaluator.toString());
    }

    @Test
    void if_givenField_andString_andString_returnsIfExpression() {
        Field condition = new Field("someField");
        String whenTrue = "someString";
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(someField,someString,someString)", evaluator.toString());
    }

    @Test
    void if_givenBooleanEvaluator_andString_andString_returnsIfExpression() {
        BooleanEvaluator condition = And.and(true, true);
        String whenTrue = "someString";
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(and(true,true),someString,someString)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andEvaluator_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andEvaluator_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andField_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andField_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andInt_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andInt_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andFloat_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andFloat_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),3.4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andDouble_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andDouble_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),2.7)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andField_andString_returnsIfExpression() {
        boolean condition = true;
        Field whenTrue = new Field("someOtherField");
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someOtherField,someString)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andFieldOrEvaluator_andString_returnsIfExpression() {
        boolean condition = true;
        FieldOrEvaluator whenTrue = Add.add(1,1);
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,add(1,1),someString)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andEvaluator_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andField_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andInt_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andFloat_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andDouble_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andInt_andString_returnsIfExpression() {
        boolean condition = true;
        int whenTrue = 4;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,4,someString)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andEvaluator_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andField_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andInt_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andFloat_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andDouble_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andDouble_andString_returnsIfExpression() {
        boolean condition = true;
        double whenTrue = 2.7d;
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,2.7,someString)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andEvaluator_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        Evaluator whenFalse = Abs.abs(-1);

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,abs(-1))", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andField_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        Field whenFalse = new Field("anotherField");

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,anotherField)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andInt_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        int whenFalse = 4;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andFloat_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        float whenFalse = 3.4f;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,3.4)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andDouble_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        double whenFalse = 2.7d;

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,2.7)", evaluator.toString());
    }

    @Test
    void if_givenBoolean_andString_andString_returnsIfExpression() {
        boolean condition = true;
        String whenTrue = "someString";
        String whenFalse = "someString";

        Evaluator evaluator = If.if_(condition, whenTrue, whenFalse);

        assertEquals("if(true,someString,someString)", evaluator.toString());
    }

}
