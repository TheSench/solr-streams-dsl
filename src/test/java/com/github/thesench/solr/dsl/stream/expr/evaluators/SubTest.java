package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Sub.sub;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SubTest {
    
    @Test
    void sub_givenSubipleFieldsAndEvaluators_returnsSubExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = sub(field1, field2, sub(field1, field2), field3);

        assertEquals("sub(field1,field2,sub(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void sub_givenFieldAndField_returnsSubExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void sub_givenFieldAndNumberEvaluator_returnsSubExpression() {
        Field firstValue = new Field("someField");
        NumberEvaluator secondValue = abs(-1);

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void sub_givenFieldAndInt_returnsSubExpression() {
        Field firstValue = new Field("someField");
        int secondValue = 4;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(someField,4)", expression.toString());
    }
    
    @Test
    void sub_givenFieldAndFloat_returnsSubExpression() {
        Field firstValue = new Field("someField");
        float secondValue = 3.4f;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(someField,3.4)", expression.toString());
    }
    
    @Test
    void sub_givenFieldAndDouble_returnsSubExpression() {
        Field firstValue = new Field("someField");
        double secondValue = 1.2d;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(someField,1.2)", expression.toString());
    }
    
    @Test
    void sub_givenNumberEvaluatorAndField_returnsSubExpression() {
        NumberEvaluator firstValue = abs(-1);;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void sub_givenNumberEvaluatorAndNumberEvaluator_returnsSubExpression() {
        NumberEvaluator firstValue = abs(-1);;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void sub_givenNumberEvaluatorAndInt_returnsSubExpression() {
        NumberEvaluator firstValue = abs(-1);;
        int secondValue = 4;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(abs(-1),4)", expression.toString());
    }
    
    @Test
    void sub_givenNumberEvaluatorAndFloat_returnsSubExpression() {
        NumberEvaluator firstValue = abs(-1);;
        float secondValue = 3.4f;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void sub_givenNumberEvaluatorAndDouble_returnsSubExpression() {
        NumberEvaluator firstValue = abs(-1);;
        double secondValue = 1.2d;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void sub_givenIntAndField_returnsSubExpression() {
        int firstValue = 4;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(4,someOtherField)", expression.toString());
    }
    
    @Test
    void sub_givenIntAndNumberEvaluator_returnsSubExpression() {
        int firstValue = 4;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(4,abs(-1))", expression.toString());
    }
    
    @Test
    void sub_givenIntAndInt_returnsSubExpression() {
        int firstValue = 4;
        int secondValue = 4;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(4,4)", expression.toString());
    }
    
    @Test
    void sub_givenIntAndFloat_returnsSubExpression() {
        int firstValue = 4;
        float secondValue = 3.4f;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(4,3.4)", expression.toString());
    }
    
    @Test
    void sub_givenIntAndDouble_returnsSubExpression() {
        int firstValue = 4;
        double secondValue = 1.2d;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(4,1.2)", expression.toString());
    }
    
    @Test
    void sub_givenFloatAndField_returnsSubExpression() {
        float firstValue = 3.4f;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void sub_givenFloatAndNumberEvaluator_returnsSubExpression() {
        float firstValue = 3.4f;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void sub_givenFloatAndInt_returnsSubExpression() {
        float firstValue = 3.4f;
        int secondValue = 4;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(3.4,4)", expression.toString());
    }
    
    @Test
    void sub_givenFloatAndFloat_returnsSubExpression() {
        float firstValue = 3.4f;
        float secondValue = 3.4f;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(3.4,3.4)", expression.toString());
    }
    
    @Test
    void sub_givenFloatAndDouble_returnsSubExpression() {
        float firstValue = 3.4f;
        double secondValue = 1.2d;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(3.4,1.2)", expression.toString());
    }
    
    @Test
    void sub_givenDoubleAndField_returnsSubExpression() {
        double firstValue = 1.2d;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void sub_givenDoubleAndNumberEvaluator_returnsSubExpression() {
        double firstValue = 1.2d;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void sub_givenDoubleAndInt_returnsSubExpression() {
        double firstValue = 1.2d;
        int secondValue = 4;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(1.2,4)", expression.toString());
    }
    
    @Test
    void sub_givenDoubleAndFloat_returnsSubExpression() {
        double firstValue = 1.2d;
        float secondValue = 3.4f;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(1.2,3.4)", expression.toString());
    }
    
    @Test
    void sub_givenDoubleAndDouble_returnsSubExpression() {
        double firstValue = 1.2d;
        double secondValue = 1.2d;

        StreamExpression expression = sub(firstValue, secondValue);

        assertEquals("sub(1.2,1.2)", expression.toString());
    }    
}
