package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Ceil.ceil;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CeilTest {
    @Test
    void ceil_givenFieldName_createsCosEvaluator() {
        StreamExpression expression = ceil("someField");

        assertEquals("ceil(someField)", expression.toString());
    }

    @Test
    void ceil_givenRawInteger_createsCosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = ceil(rawInt);

        assertEquals("ceil(4)", expression.toString());
    }

    @Test
    void ceil_givenRawShort_createsCosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = ceil(rawShort);

        assertEquals("ceil(17)", expression.toString());
    }

    @Test
    void ceil_givenRawLong_createsCosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = ceil(rawLong);

        assertEquals("ceil(42)", expression.toString());
    }

    @Test
    void ceil_givenRawDouble_createsCosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = ceil(rawDouble);

        assertEquals("ceil(45.123)", expression.toString());
    }

    @Test
    void ceil_givenRawFloat_createsCosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = ceil(rawFloat);

        assertEquals("ceil(24.321)", expression.toString());
    }
}
