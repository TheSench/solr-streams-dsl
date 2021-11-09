package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Div.div;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class DivTest {
    
    @Test
    void div_givenFieldAndField_returnsDivExpression() {
        Field dividend = new Field("someField");
        Field divisor = new Field("someOtherField");

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void div_givenFieldAndNumberEvaluator_returnsDivExpression() {
        Field dividend = new Field("someField");
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void div_givenFieldAndInt_returnsDivExpression() {
        Field dividend = new Field("someField");
        int divisor = 4;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(someField,4)", expression.toString());
    }
    
    @Test
    void div_givenFieldAndFloat_returnsDivExpression() {
        Field dividend = new Field("someField");
        float divisor = 3.4f;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(someField,3.4)", expression.toString());
    }
    
    @Test
    void div_givenFieldAndDouble_returnsDivExpression() {
        Field dividend = new Field("someField");
        double divisor = 1.2d;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(someField,1.2)", expression.toString());
    }
    
    @Test
    void div_givenNumberEvaluatorAndField_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);
        Field divisor = new Field("someOtherField");

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void div_givenNumberEvaluatorAndNumberEvaluator_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void div_givenNumberEvaluatorAndInt_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);
        int divisor = 4;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(abs(-1),4)", expression.toString());
    }
    
    @Test
    void div_givenNumberEvaluatorAndFloat_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);
        float divisor = 3.4f;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void div_givenNumberEvaluatorAndDouble_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);
        double divisor = 1.2d;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void div_givenIntAndField_returnsDivExpression() {
        int dividend = 4;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(4,someOtherField)", expression.toString());
    }
    
    @Test
    void div_givenIntAndNumberEvaluator_returnsDivExpression() {
        int dividend = 4;
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(4,abs(-1))", expression.toString());
    }
    
    @Test
    void div_givenIntAndInt_returnsDivExpression() {
        int dividend = 4;
        int divisor = 4;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(4,4)", expression.toString());
    }
    
    @Test
    void div_givenIntAndFloat_returnsDivExpression() {
        int dividend = 4;
        float divisor = 3.4f;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(4,3.4)", expression.toString());
    }
    
    @Test
    void div_givenIntAndDouble_returnsDivExpression() {
        int dividend = 4;
        double divisor = 1.2d;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(4,1.2)", expression.toString());
    }
    
    @Test
    void div_givenFloatAndField_returnsDivExpression() {
        float dividend = 3.4f;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void div_givenFloatAndNumberEvaluator_returnsDivExpression() {
        float dividend = 3.4f;
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void div_givenFloatAndInt_returnsDivExpression() {
        float dividend = 3.4f;
        int divisor = 4;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(3.4,4)", expression.toString());
    }
    
    @Test
    void div_givenFloatAndFloat_returnsDivExpression() {
        float dividend = 3.4f;
        float divisor = 3.4f;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(3.4,3.4)", expression.toString());
    }
    
    @Test
    void div_givenFloatAndDouble_returnsDivExpression() {
        float dividend = 3.4f;
        double divisor = 1.2d;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(3.4,1.2)", expression.toString());
    }
    
    @Test
    void div_givenDoubleAndField_returnsDivExpression() {
        double dividend = 1.2d;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void div_givenDoubleAndNumberEvaluator_returnsDivExpression() {
        double dividend = 1.2d;
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void div_givenDoubleAndInt_returnsDivExpression() {
        double dividend = 1.2d;
        int divisor = 4;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(1.2,4)", expression.toString());
    }
    
    @Test
    void div_givenDoubleAndFloat_returnsDivExpression() {
        double dividend = 1.2d;
        float divisor = 3.4f;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(1.2,3.4)", expression.toString());
    }
    
    @Test
    void div_givenDoubleAndDouble_returnsDivExpression() {
        double dividend = 1.2d;
        double divisor = 1.2d;

        StreamExpression expression = div(dividend, divisor);

        assertEquals("div(1.2,1.2)", expression.toString());
    }    
}
