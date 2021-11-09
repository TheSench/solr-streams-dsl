package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Pow.pow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class PowTest {
    
    @Test
    void pow_givenFieldAndField_returnsPowExpression() {
        Field base = new Field("someField");
        Field exponent = new Field("someOtherField");

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(someField,someOtherField)", expression.toString());
    }
    
    @Test
    void pow_givenFieldAndNumberEvaluator_returnsPowExpression() {
        Field base = new Field("someField");
        NumberEvaluator exponent = abs(-1);

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(someField,abs(-1))", expression.toString());
    }
    
    @Test
    void pow_givenFieldAndInt_returnsPowExpression() {
        Field base = new Field("someField");
        int exponent = 4;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(someField,4)", expression.toString());
    }
    
    @Test
    void pow_givenFieldAndFloat_returnsPowExpression() {
        Field base = new Field("someField");
        float exponent = 3.4f;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(someField,3.4)", expression.toString());
    }
    
    @Test
    void pow_givenFieldAndDouble_returnsPowExpression() {
        Field base = new Field("someField");
        double exponent = 1.2d;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(someField,1.2)", expression.toString());
    }
    
    @Test
    void pow_givenNumberEvaluatorAndField_returnsPowExpression() {
        NumberEvaluator base = abs(-1);;
        Field exponent = new Field("someOtherField");

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(abs(-1),someOtherField)", expression.toString());
    }
    
    @Test
    void pow_givenNumberEvaluatorAndNumberEvaluator_returnsPowExpression() {
        NumberEvaluator base = abs(-1);;
        NumberEvaluator exponent = abs(-1);;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(abs(-1),abs(-1))", expression.toString());
    }
    
    @Test
    void pow_givenNumberEvaluatorAndInt_returnsPowExpression() {
        NumberEvaluator base = abs(-1);;
        int exponent = 4;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(abs(-1),4)", expression.toString());
    }
    
    @Test
    void pow_givenNumberEvaluatorAndFloat_returnsPowExpression() {
        NumberEvaluator base = abs(-1);;
        float exponent = 3.4f;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(abs(-1),3.4)", expression.toString());
    }
    
    @Test
    void pow_givenNumberEvaluatorAndDouble_returnsPowExpression() {
        NumberEvaluator base = abs(-1);;
        double exponent = 1.2d;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(abs(-1),1.2)", expression.toString());
    }
    
    @Test
    void pow_givenIntAndField_returnsPowExpression() {
        int base = 4;
        Field exponent = new Field("someOtherField");

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(4,someOtherField)", expression.toString());
    }
    
    @Test
    void pow_givenIntAndNumberEvaluator_returnsPowExpression() {
        int base = 4;
        NumberEvaluator exponent = abs(-1);;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(4,abs(-1))", expression.toString());
    }
    
    @Test
    void pow_givenIntAndInt_returnsPowExpression() {
        int base = 4;
        int exponent = 4;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(4,4)", expression.toString());
    }
    
    @Test
    void pow_givenIntAndFloat_returnsPowExpression() {
        int base = 4;
        float exponent = 3.4f;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(4,3.4)", expression.toString());
    }
    
    @Test
    void pow_givenIntAndDouble_returnsPowExpression() {
        int base = 4;
        double exponent = 1.2d;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(4,1.2)", expression.toString());
    }
    
    @Test
    void pow_givenFloatAndField_returnsPowExpression() {
        float base = 3.4f;
        Field exponent = new Field("someOtherField");

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(3.4,someOtherField)", expression.toString());
    }
    
    @Test
    void pow_givenFloatAndNumberEvaluator_returnsPowExpression() {
        float base = 3.4f;
        NumberEvaluator exponent = abs(-1);;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(3.4,abs(-1))", expression.toString());
    }
    
    @Test
    void pow_givenFloatAndInt_returnsPowExpression() {
        float base = 3.4f;
        int exponent = 4;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(3.4,4)", expression.toString());
    }
    
    @Test
    void pow_givenFloatAndFloat_returnsPowExpression() {
        float base = 3.4f;
        float exponent = 3.4f;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(3.4,3.4)", expression.toString());
    }
    
    @Test
    void pow_givenFloatAndDouble_returnsPowExpression() {
        float base = 3.4f;
        double exponent = 1.2d;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(3.4,1.2)", expression.toString());
    }
    
    @Test
    void pow_givenDoubleAndField_returnsPowExpression() {
        double base = 1.2d;
        Field exponent = new Field("someOtherField");

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(1.2,someOtherField)", expression.toString());
    }
    
    @Test
    void pow_givenDoubleAndNumberEvaluator_returnsPowExpression() {
        double base = 1.2d;
        NumberEvaluator exponent = abs(-1);;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(1.2,abs(-1))", expression.toString());
    }
    
    @Test
    void pow_givenDoubleAndInt_returnsPowExpression() {
        double base = 1.2d;
        int exponent = 4;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(1.2,4)", expression.toString());
    }
    
    @Test
    void pow_givenDoubleAndFloat_returnsPowExpression() {
        double base = 1.2d;
        float exponent = 3.4f;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(1.2,3.4)", expression.toString());
    }
    
    @Test
    void pow_givenDoubleAndDouble_returnsPowExpression() {
        double base = 1.2d;
        double exponent = 1.2d;

        StreamExpression expression = pow(base, exponent);

        assertEquals("pow(1.2,1.2)", expression.toString());
    }    
}
