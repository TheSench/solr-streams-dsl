package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Cosh.cosh;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CoshTest {
    @Test
    void cosh_givenFieldName_createsCosEvaluator() {
        StreamExpression expression = cosh("someField");

        assertEquals("cosh(someField)", expression.toString());
    }

    @Test
    void cosh_givenRawInteger_createsCosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = cosh(rawInt);

        assertEquals("cosh(4)", expression.toString());
    }

    @Test
    void cosh_givenRawShort_createsCosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = cosh(rawShort);

        assertEquals("cosh(17)", expression.toString());
    }

    @Test
    void cosh_givenRawLong_createsCosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = cosh(rawLong);

        assertEquals("cosh(42)", expression.toString());
    }

    @Test
    void cosh_givenRawDouble_createsCosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = cosh(rawDouble);

        assertEquals("cosh(45.123)", expression.toString());
    }

    @Test
    void cosh_givenRawFloat_createsCosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = cosh(rawFloat);

        assertEquals("cosh(24.321)", expression.toString());
    }
}
