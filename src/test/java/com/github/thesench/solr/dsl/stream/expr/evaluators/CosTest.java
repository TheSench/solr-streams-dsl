package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Cos.cos;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CosTest {
    @Test
    void cos_givenFieldName_createsCosEvaluator() {
        StreamExpression expression = cos("someField");

        assertEquals("cos(someField)", expression.toString());
    }

    @Test
    void cos_givenRawInteger_createsCosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = cos(rawInt);

        assertEquals("cos(4)", expression.toString());
    }

    @Test
    void cos_givenRawShort_createsCosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = cos(rawShort);

        assertEquals("cos(17)", expression.toString());
    }

    @Test
    void cos_givenRawLong_createsCosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = cos(rawLong);

        assertEquals("cos(42)", expression.toString());
    }

    @Test
    void cos_givenRawDouble_createsCosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = cos(rawDouble);

        assertEquals("cos(45.123)", expression.toString());
    }

    @Test
    void cos_givenRawFloat_createsCosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = cos(rawFloat);

        assertEquals("cos(24.321)", expression.toString());
    }
}
