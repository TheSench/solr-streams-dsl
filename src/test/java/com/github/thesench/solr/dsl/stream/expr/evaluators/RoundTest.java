package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Round.round;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class RoundTest {
    @Test
    void round_givenFieldName_createsCosEvaluator() {
        StreamExpression expression = round("someField");

        assertEquals("round(someField)", expression.toString());
    }

    @Test
    void round_givenRawInteger_createsCosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = round(rawInt);

        assertEquals("round(4)", expression.toString());
    }

    @Test
    void round_givenRawShort_createsCosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = round(rawShort);

        assertEquals("round(17)", expression.toString());
    }

    @Test
    void round_givenRawLong_createsCosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = round(rawLong);

        assertEquals("round(42)", expression.toString());
    }

    @Test
    void round_givenRawDouble_createsCosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = round(rawDouble);

        assertEquals("round(45.123)", expression.toString());
    }

    @Test
    void round_givenRawFloat_createsCosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = round(rawFloat);

        assertEquals("round(24.321)", expression.toString());
    }
}
