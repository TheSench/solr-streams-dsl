package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Floor.floor;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class FloorTest {
    @Test
    void floor_givenFieldName_createsCosEvaluator() {
        StreamExpression expression = floor("someField");

        assertEquals("floor(someField)", expression.toString());
    }

    @Test
    void floor_givenRawInteger_createsCosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = floor(rawInt);

        assertEquals("floor(4)", expression.toString());
    }

    @Test
    void floor_givenRawShort_createsCosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = floor(rawShort);

        assertEquals("floor(17)", expression.toString());
    }

    @Test
    void floor_givenRawLong_createsCosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = floor(rawLong);

        assertEquals("floor(42)", expression.toString());
    }

    @Test
    void floor_givenRawDouble_createsCosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = floor(rawDouble);

        assertEquals("floor(45.123)", expression.toString());
    }

    @Test
    void floor_givenRawFloat_createsCosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = floor(rawFloat);

        assertEquals("floor(24.321)", expression.toString());
    }
}
