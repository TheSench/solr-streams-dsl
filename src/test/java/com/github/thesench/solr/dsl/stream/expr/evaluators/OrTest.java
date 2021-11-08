package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Or.or;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class OrTest {
    
    @Test
    void or_givenMultipleFieldsOrEvaluators_returnsOrExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = or(field1, field2, or(field1, field2), field3);

        assertEquals("or(field1,field2,or(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void or_givenFieldOrField_returnsOrExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void or_givenFieldOrBooleanEvaluator_returnsOrExpression() {
        Field firstValue = new Field("someField");
        BooleanEvaluator secondValue = or(true, true);

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(someField,or(true,true))", expression.toString());
    }
    
    @Test
    void or_givenFieldOrBoolean_returnsOrExpression() {
        Field firstValue = new Field("someField");
        boolean secondValue = true;

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(someField,true)", expression.toString());
    }
    
    @Test
    void or_givenBooleanEvaluatorOrField_returnsOrExpression() {
        BooleanEvaluator firstValue = or(true, true);
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(or(true,true),someOtherField)", expression.toString());
    }
    
    @Test
    void or_givenBooleanEvaluatorOrBooleanEvaluator_returnsOrExpression() {
        BooleanEvaluator firstValue = or(true, true);
        BooleanEvaluator secondValue = or(true, true);

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(or(true,true),or(true,true))", expression.toString());
    }
    
    @Test
    void or_givenBooleanEvaluatorOrBoolean_returnsOrExpression() {
        BooleanEvaluator firstValue = or(true, true);
        boolean secondValue = true;

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(or(true,true),true)", expression.toString());
    }
    
    @Test
    void or_givenBooleanOrField_returnsOrExpression() {
        boolean firstValue = true;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(true,someOtherField)", expression.toString());
    }
    
    @Test
    void or_givenBooleanOrBooleanEvaluator_returnsOrExpression() {
        boolean firstValue = true;
        BooleanEvaluator secondValue = or(true, true);

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(true,or(true,true))", expression.toString());
    }
    
    @Test
    void or_givenBooleanOrInt_returnsOrExpression() {
        boolean firstValue = true;
        boolean secondValue = true;

        StreamExpression expression = or(firstValue, secondValue);

        assertEquals("or(true,true)", expression.toString());
    }
}
