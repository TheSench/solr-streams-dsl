package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Add.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AddTest {
    
    @Test
    void add_givenMultipleFieldsAndEvaluators_returnsAddExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = add(field1, field2, add(field1, field2), field3);

        assertEquals("add(field1,field2,add(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void add_givenFieldAndField_returnsAddExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void add_givenFieldAndNumberEvaluator_returnsAddExpression() {
        Field firstValue = new Field("someField");
        NumberEvaluator secondValue = abs(-1);

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void add_givenFieldAndInt_returnsAddExpression() {
        Field firstValue = new Field("someField");
        int secondValue = 4;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(someField,4)", expression.toString());
    }
    
    @Test
    void add_givenFieldAndFloat_returnsAddExpression() {
        Field firstValue = new Field("someField");
        float secondValue = 3.4f;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(someField,3.4)", expression.toString());
    }
    
    @Test
    void add_givenFieldAndDouble_returnsAddExpression() {
        Field firstValue = new Field("someField");
        double secondValue = 1.2d;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(someField,1.2)", expression.toString());
    }
    
    @Test
    void add_givenNumberEvaluatorAndField_returnsAddExpression() {
        NumberEvaluator firstValue = abs(-1);;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void add_givenNumberEvaluatorAndNumberEvaluator_returnsAddExpression() {
        NumberEvaluator firstValue = abs(-1);;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void add_givenNumberEvaluatorAndInt_returnsAddExpression() {
        NumberEvaluator firstValue = abs(-1);;
        int secondValue = 4;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(abs(-1),4)", expression.toString());
    }
    
    @Test
    void add_givenNumberEvaluatorAndFloat_returnsAddExpression() {
        NumberEvaluator firstValue = abs(-1);;
        float secondValue = 3.4f;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void add_givenNumberEvaluatorAndDouble_returnsAddExpression() {
        NumberEvaluator firstValue = abs(-1);;
        double secondValue = 1.2d;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void add_givenIntAndField_returnsAddExpression() {
        int firstValue = 4;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(4,someOtherField)", expression.toString());
    }
    
    @Test
    void add_givenIntAndNumberEvaluator_returnsAddExpression() {
        int firstValue = 4;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(4,abs(-1))", expression.toString());
    }
    
    @Test
    void add_givenIntAndInt_returnsAddExpression() {
        int firstValue = 4;
        int secondValue = 4;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(4,4)", expression.toString());
    }
    
    @Test
    void add_givenIntAndFloat_returnsAddExpression() {
        int firstValue = 4;
        float secondValue = 3.4f;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(4,3.4)", expression.toString());
    }
    
    @Test
    void add_givenIntAndDouble_returnsAddExpression() {
        int firstValue = 4;
        double secondValue = 1.2d;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(4,1.2)", expression.toString());
    }
    
    @Test
    void add_givenFloatAndField_returnsAddExpression() {
        float firstValue = 3.4f;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void add_givenFloatAndNumberEvaluator_returnsAddExpression() {
        float firstValue = 3.4f;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void add_givenFloatAndInt_returnsAddExpression() {
        float firstValue = 3.4f;
        int secondValue = 4;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(3.4,4)", expression.toString());
    }
    
    @Test
    void add_givenFloatAndFloat_returnsAddExpression() {
        float firstValue = 3.4f;
        float secondValue = 3.4f;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(3.4,3.4)", expression.toString());
    }
    
    @Test
    void add_givenFloatAndDouble_returnsAddExpression() {
        float firstValue = 3.4f;
        double secondValue = 1.2d;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(3.4,1.2)", expression.toString());
    }
    
    @Test
    void add_givenDoubleAndField_returnsAddExpression() {
        double firstValue = 1.2d;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void add_givenDoubleAndNumberEvaluator_returnsAddExpression() {
        double firstValue = 1.2d;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void add_givenDoubleAndInt_returnsAddExpression() {
        double firstValue = 1.2d;
        int secondValue = 4;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(1.2,4)", expression.toString());
    }
    
    @Test
    void add_givenDoubleAndFloat_returnsAddExpression() {
        double firstValue = 1.2d;
        float secondValue = 3.4f;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(1.2,3.4)", expression.toString());
    }
    
    @Test
    void add_givenDoubleAndDouble_returnsAddExpression() {
        double firstValue = 1.2d;
        double secondValue = 1.2d;

        StreamExpression expression = add(firstValue, secondValue);

        assertEquals("add(1.2,1.2)", expression.toString());
    }    
}
