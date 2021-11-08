package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Sinh.sinh;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SinhTest {
    @Test
    void sinh_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = sinh("someField");

        assertEquals("sinh(someField)", expression.toString());
    }

    @Test
    void sinh_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = sinh(rawInt);

        assertEquals("sinh(4)", expression.toString());
    }

    @Test
    void sinh_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = sinh(rawShort);

        assertEquals("sinh(17)", expression.toString());
    }

    @Test
    void sinh_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = sinh(rawLong);

        assertEquals("sinh(42)", expression.toString());
    }

    @Test
    void sinh_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = sinh(rawDouble);

        assertEquals("sinh(45.123)", expression.toString());
    }

    @Test
    void sinh_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = sinh(rawFloat);

        assertEquals("sinh(24.321)", expression.toString());
    }
}
