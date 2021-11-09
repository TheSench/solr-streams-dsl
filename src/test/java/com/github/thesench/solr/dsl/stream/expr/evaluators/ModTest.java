package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Mod.mod;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class ModTest {
    
    @Test
    void mod_givenFieldAndField_returnsDivExpression() {
        Field dividend = new Field("someField");
        Field divisor = new Field("someOtherField");

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void mod_givenFieldAndNumberEvaluator_returnsDivExpression() {
        Field dividend = new Field("someField");
        NumberEvaluator divisor = abs(-1);

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void mod_givenFieldAndInt_returnsDivExpression() {
        Field dividend = new Field("someField");
        int divisor = 4;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(someField,4)", expression.toString());
    }
    
    @Test
    void mod_givenFieldAndFloat_returnsDivExpression() {
        Field dividend = new Field("someField");
        float divisor = 3.4f;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(someField,3.4)", expression.toString());
    }
    
    @Test
    void mod_givenFieldAndDouble_returnsDivExpression() {
        Field dividend = new Field("someField");
        double divisor = 1.2d;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(someField,1.2)", expression.toString());
    }
    
    @Test
    void mod_givenNumberEvaluatorAndField_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void mod_givenNumberEvaluatorAndNumberEvaluator_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);;
        NumberEvaluator divisor = abs(-1);;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void mod_givenNumberEvaluatorAndInt_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);;
        int divisor = 4;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(abs(-1),4)", expression.toString());
    }
    
    @Test
    void mod_givenNumberEvaluatorAndFloat_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);;
        float divisor = 3.4f;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void mod_givenNumberEvaluatorAndDouble_returnsDivExpression() {
        NumberEvaluator dividend = abs(-1);;
        double divisor = 1.2d;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void mod_givenIntAndField_returnsDivExpression() {
        int dividend = 4;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(4,someOtherField)", expression.toString());
    }
    
    @Test
    void mod_givenIntAndNumberEvaluator_returnsDivExpression() {
        int dividend = 4;
        NumberEvaluator divisor = abs(-1);;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(4,abs(-1))", expression.toString());
    }
    
    @Test
    void mod_givenIntAndInt_returnsDivExpression() {
        int dividend = 4;
        int divisor = 4;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(4,4)", expression.toString());
    }
    
    @Test
    void mod_givenIntAndFloat_returnsDivExpression() {
        int dividend = 4;
        float divisor = 3.4f;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(4,3.4)", expression.toString());
    }
    
    @Test
    void mod_givenIntAndDouble_returnsDivExpression() {
        int dividend = 4;
        double divisor = 1.2d;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(4,1.2)", expression.toString());
    }
    
    @Test
    void mod_givenFloatAndField_returnsDivExpression() {
        float dividend = 3.4f;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void mod_givenFloatAndNumberEvaluator_returnsDivExpression() {
        float dividend = 3.4f;
        NumberEvaluator divisor = abs(-1);;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void mod_givenFloatAndInt_returnsDivExpression() {
        float dividend = 3.4f;
        int divisor = 4;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(3.4,4)", expression.toString());
    }
    
    @Test
    void mod_givenFloatAndFloat_returnsDivExpression() {
        float dividend = 3.4f;
        float divisor = 3.4f;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(3.4,3.4)", expression.toString());
    }
    
    @Test
    void mod_givenFloatAndDouble_returnsDivExpression() {
        float dividend = 3.4f;
        double divisor = 1.2d;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(3.4,1.2)", expression.toString());
    }
    
    @Test
    void mod_givenDoubleAndField_returnsDivExpression() {
        double dividend = 1.2d;
        Field divisor = new Field("someOtherField");

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void mod_givenDoubleAndNumberEvaluator_returnsDivExpression() {
        double dividend = 1.2d;
        NumberEvaluator divisor = abs(-1);;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void mod_givenDoubleAndInt_returnsDivExpression() {
        double dividend = 1.2d;
        int divisor = 4;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(1.2,4)", expression.toString());
    }
    
    @Test
    void mod_givenDoubleAndFloat_returnsDivExpression() {
        double dividend = 1.2d;
        float divisor = 3.4f;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(1.2,3.4)", expression.toString());
    }
    
    @Test
    void mod_givenDoubleAndDouble_returnsDivExpression() {
        double dividend = 1.2d;
        double divisor = 1.2d;

        StreamExpression expression = mod(dividend, divisor);

        assertEquals("mod(1.2,1.2)", expression.toString());
    }    
}
