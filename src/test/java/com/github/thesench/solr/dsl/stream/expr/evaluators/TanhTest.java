package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Tanh.tanh;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class TanhTest {
    @Test
    void tanh_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = tanh("someField");

        assertEquals("tanh(someField)", expression.toString());
    }

    @Test
    void tanh_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = tanh(rawInt);

        assertEquals("tanh(4)", expression.toString());
    }

    @Test
    void tanh_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = tanh(rawShort);

        assertEquals("tanh(17)", expression.toString());
    }

    @Test
    void tanh_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = tanh(rawLong);

        assertEquals("tanh(42)", expression.toString());
    }

    @Test
    void tanh_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = tanh(rawDouble);

        assertEquals("tanh(45.123)", expression.toString());
    }

    @Test
    void tanh_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = tanh(rawFloat);

        assertEquals("tanh(24.321)", expression.toString());
    }
}
