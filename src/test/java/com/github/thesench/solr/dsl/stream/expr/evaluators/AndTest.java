package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.And.and;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AndTest {
    
    @Test
    void and_givenMultipleFieldsAndEvaluators_returnsAndExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = and(field1, field2, and(field1, field2), field3);

        assertEquals("and(field1,field2,and(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void and_givenFieldAndField_returnsAndExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void and_givenFieldAndBooleanEvaluator_returnsAndExpression() {
        Field firstValue = new Field("someField");
        BooleanEvaluator secondValue = and(true, true);

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(someField,and(true,true))", expression.toString());
    }
    
    @Test
    void and_givenFieldAndBoolean_returnsAndExpression() {
        Field firstValue = new Field("someField");
        boolean secondValue = true;

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(someField,true)", expression.toString());
    }
    
    @Test
    void and_givenBooleanEvaluatorAndField_returnsAndExpression() {
        BooleanEvaluator firstValue = and(true, true);
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(and(true,true),someOtherField)", expression.toString());
    }
    
    @Test
    void and_givenBooleanEvaluatorAndBooleanEvaluator_returnsAndExpression() {
        BooleanEvaluator firstValue = and(true, true);
        BooleanEvaluator secondValue = and(true, true);

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(and(true,true),and(true,true))", expression.toString());
    }
    
    @Test
    void and_givenBooleanEvaluatorAndBoolean_returnsAndExpression() {
        BooleanEvaluator firstValue = and(true, true);
        boolean secondValue = true;

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(and(true,true),true)", expression.toString());
    }
    
    @Test
    void and_givenBooleanAndField_returnsAndExpression() {
        boolean firstValue = true;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(true,someOtherField)", expression.toString());
    }
    
    @Test
    void and_givenBooleanAndBooleanEvaluator_returnsAndExpression() {
        boolean firstValue = true;
        BooleanEvaluator secondValue = and(true, true);

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(true,and(true,true))", expression.toString());
    }
    
    @Test
    void and_givenBooleanAndInt_returnsAndExpression() {
        boolean firstValue = true;
        boolean secondValue = true;

        StreamExpression expression = and(firstValue, secondValue);

        assertEquals("and(true,true)", expression.toString());
    }
}
