package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Atan.atan;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AtanTest {
    @Test
    void atan_givenFieldName_createsAtanEvaluator() {
        StreamExpression expression = atan("someField");

        assertEquals("atan(someField)", expression.toString());
    }

    @Test
    void atan_givenRawInteger_createsAtanEvaluator() {
        int rawInt = 4;

        StreamExpression expression = atan(rawInt);

        assertEquals("atan(4)", expression.toString());
    }

    @Test
    void atan_givenRawShort_createsAtanEvaluator() {
        short rawShort = 17;

        StreamExpression expression = atan(rawShort);

        assertEquals("atan(17)", expression.toString());
    }

    @Test
    void atan_givenRawLong_createsAtanEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = atan(rawLong);

        assertEquals("atan(42)", expression.toString());
    }

    @Test
    void atan_givenRawDouble_createsAtanEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = atan(rawDouble);

        assertEquals("atan(45.123)", expression.toString());
    }

    @Test
    void atan_givenRawFloat_createsAtanEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = atan(rawFloat);

        assertEquals("atan(24.321)", expression.toString());
    }
}
