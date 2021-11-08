package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Sqrt.sqrt;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SqrtTest {
    @Test
    void sqrt_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = sqrt("someField");

        assertEquals("sqrt(someField)", expression.toString());
    }

    @Test
    void sqrt_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = sqrt(rawInt);

        assertEquals("sqrt(4)", expression.toString());
    }

    @Test
    void sqrt_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = sqrt(rawShort);

        assertEquals("sqrt(17)", expression.toString());
    }

    @Test
    void sqrt_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = sqrt(rawLong);

        assertEquals("sqrt(42)", expression.toString());
    }

    @Test
    void sqrt_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = sqrt(rawDouble);

        assertEquals("sqrt(45.123)", expression.toString());
    }

    @Test
    void sqrt_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = sqrt(rawFloat);

        assertEquals("sqrt(24.321)", expression.toString());
    }
}
