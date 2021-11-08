package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Mult.mult;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class MultTest {
    
    @Test
    void mult_givenMultipleFieldsAndEvaluators_returnsMultExpression() {
        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        StreamExpression expression = mult(field1, field2, mult(field1, field2), field3);

        assertEquals("mult(field1,field2,mult(field1,field2),field3)", expression.toString());
    }
    
    @Test
    void mult_givenFieldAndField_returnsMultExpression() {
        Field firstValue = new Field("someField");
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void mult_givenFieldAndNumberEvaluator_returnsMultExpression() {
        Field firstValue = new Field("someField");
        NumberEvaluator secondValue = abs(-1);

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void mult_givenFieldAndInt_returnsMultExpression() {
        Field firstValue = new Field("someField");
        int secondValue = 4;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(someField,4)", expression.toString());
    }
    
    @Test
    void mult_givenFieldAndFloat_returnsMultExpression() {
        Field firstValue = new Field("someField");
        float secondValue = 3.4f;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(someField,3.4)", expression.toString());
    }
    
    @Test
    void mult_givenFieldAndDouble_returnsMultExpression() {
        Field firstValue = new Field("someField");
        double secondValue = 1.2d;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(someField,1.2)", expression.toString());
    }
    
    @Test
    void mult_givenNumberEvaluatorAndField_returnsMultExpression() {
        NumberEvaluator firstValue = abs(-1);;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void mult_givenNumberEvaluatorAndNumberEvaluator_returnsMultExpression() {
        NumberEvaluator firstValue = abs(-1);;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void mult_givenNumberEvaluatorAndInt_returnsMultExpression() {
        NumberEvaluator firstValue = abs(-1);;
        int secondValue = 4;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(abs(-1),4)", expression.toString());
    }
    
    @Test
    void mult_givenNumberEvaluatorAndFloat_returnsMultExpression() {
        NumberEvaluator firstValue = abs(-1);;
        float secondValue = 3.4f;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void mult_givenNumberEvaluatorAndDouble_returnsMultExpression() {
        NumberEvaluator firstValue = abs(-1);;
        double secondValue = 1.2d;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void mult_givenintAndField_returnsMultExpression() {
        int firstValue = 4;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(4,someOtherField)", expression.toString());
    }
    
    @Test
    void mult_givenintAndNumberEvaluator_returnsMultExpression() {
        int firstValue = 4;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(4,abs(-1))", expression.toString());
    }
    
    @Test
    void mult_givenintAndInt_returnsMultExpression() {
        int firstValue = 4;
        int secondValue = 4;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(4,4)", expression.toString());
    }
    
    @Test
    void mult_givenintAndFloat_returnsMultExpression() {
        int firstValue = 4;
        float secondValue = 3.4f;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(4,3.4)", expression.toString());
    }
    
    @Test
    void mult_givenintAndDouble_returnsMultExpression() {
        int firstValue = 4;
        double secondValue = 1.2d;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(4,1.2)", expression.toString());
    }
    
    @Test
    void mult_givenfloatAndField_returnsMultExpression() {
        float firstValue = 3.4f;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void mult_givenfloatAndNumberEvaluator_returnsMultExpression() {
        float firstValue = 3.4f;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void mult_givenfloatAndInt_returnsMultExpression() {
        float firstValue = 3.4f;
        int secondValue = 4;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(3.4,4)", expression.toString());
    }
    
    @Test
    void mult_givenfloatAndFloat_returnsMultExpression() {
        float firstValue = 3.4f;
        float secondValue = 3.4f;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(3.4,3.4)", expression.toString());
    }
    
    @Test
    void mult_givenfloatAndDouble_returnsMultExpression() {
        float firstValue = 3.4f;
        double secondValue = 1.2d;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(3.4,1.2)", expression.toString());
    }
    
    @Test
    void mult_givendoubleAndField_returnsMultExpression() {
        double firstValue = 1.2d;
        Field secondValue = new Field("someOtherField");

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void mult_givendoubleAndNumberEvaluator_returnsMultExpression() {
        double firstValue = 1.2d;
        NumberEvaluator secondValue = abs(-1);;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void mult_givendoubleAndInt_returnsMultExpression() {
        double firstValue = 1.2d;
        int secondValue = 4;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(1.2,4)", expression.toString());
    }
    
    @Test
    void mult_givendoubleAndFloat_returnsMultExpression() {
        double firstValue = 1.2d;
        float secondValue = 3.4f;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(1.2,3.4)", expression.toString());
    }
    
    @Test
    void mult_givendoubleAndDouble_returnsMultExpression() {
        double firstValue = 1.2d;
        double secondValue = 1.2d;

        StreamExpression expression = mult(firstValue, secondValue);

        assertEquals("mult(1.2,1.2)", expression.toString());
    }    
}
