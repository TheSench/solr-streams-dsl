package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Asin.asin;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AsinTest {
    @Test
    void asin_givenFieldName_createsAsinEvaluator() {
        StreamExpression expression = asin("someField");

        assertEquals("asin(someField)", expression.toString());
    }

    @Test
    void asin_givenRawInteger_createsAsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = asin(rawInt);

        assertEquals("asin(4)", expression.toString());
    }

    @Test
    void asin_givenRawShort_createsAsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = asin(rawShort);

        assertEquals("asin(17)", expression.toString());
    }

    @Test
    void asin_givenRawLong_createsAsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = asin(rawLong);

        assertEquals("asin(42)", expression.toString());
    }

    @Test
    void asin_givenRawDouble_createsAsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = asin(rawDouble);

        assertEquals("asin(45.123)", expression.toString());
    }

    @Test
    void asin_givenRawFloat_createsAsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = asin(rawFloat);

        assertEquals("asin(24.321)", expression.toString());
    }
}
