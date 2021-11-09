package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Eor.eor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class EorTest {
    
    @Test
    void eor_givenMultipleFieldsEorEvaluators_returnsEorExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = eor(field1, field2, eor(field1, field2), field3);

        assertEquals("eor(field1,field2,eor(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void eor_givenFieldEorField_returnsEorExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void eor_givenFieldEorBooleanEvaluator_returnsEorExpression() {
        Field firstValue = new Field("someField");
        BooleanEvaluator secondValue = eor(true, true);

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(someField,eor(true,true))", expression.toString());
    }
    
    @Test
    void eor_givenFieldEorBoolean_returnsEorExpression() {
        Field firstValue = new Field("someField");
        boolean secondValue = true;

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(someField,true)", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEvaluatorEorField_returnsEorExpression() {
        BooleanEvaluator firstValue = eor(true, true);
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(eor(true,true),someOtherField)", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEvaluatorEorBooleanEvaluator_returnsEorExpression() {
        BooleanEvaluator firstValue = eor(true, true);
        BooleanEvaluator secondValue = eor(true, true);

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(eor(true,true),eor(true,true))", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEvaluatorEorBoolean_returnsEorExpression() {
        BooleanEvaluator firstValue = eor(true, true);
        boolean secondValue = true;

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(eor(true,true),true)", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEorField_returnsEorExpression() {
        boolean firstValue = true;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(true,someOtherField)", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEorBooleanEvaluator_returnsEorExpression() {
        boolean firstValue = true;
        BooleanEvaluator secondValue = eor(true, true);

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(true,eor(true,true))", expression.toString());
    }
    
    @Test
    void eor_givenBooleanEorInt_returnsEorExpression() {
        boolean firstValue = true;
        boolean secondValue = true;

        StreamExpression expression = eor(firstValue, secondValue);

        assertEquals("eor(true,true)", expression.toString());
    }
}
