package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Sin.sin;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SinTest {
    @Test
    void sin_givenFieldName_createsSinEvaluator() {
        StreamExpression expression = sin("someField");

        assertEquals("sin(someField)", expression.toString());
    }

    @Test
    void sin_givenRawInteger_createsSinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = sin(rawInt);

        assertEquals("sin(4)", expression.toString());
    }

    @Test
    void sin_givenRawShort_createsSinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = sin(rawShort);

        assertEquals("sin(17)", expression.toString());
    }

    @Test
    void sin_givenRawLong_createsSinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = sin(rawLong);

        assertEquals("sin(42)", expression.toString());
    }

    @Test
    void sin_givenRawDouble_createsSinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = sin(rawDouble);

        assertEquals("sin(45.123)", expression.toString());
    }

    @Test
    void sin_givenRawFloat_createsSinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = sin(rawFloat);

        assertEquals("sin(24.321)", expression.toString());
    }
}
