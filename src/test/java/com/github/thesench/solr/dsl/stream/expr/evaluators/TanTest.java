package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Tan.tan;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class TanTest {
    @Test
    void tan_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = tan("someField");

        assertEquals("tan(someField)", expression.toString());
    }

    @Test
    void tan_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = tan(rawInt);

        assertEquals("tan(4)", expression.toString());
    }

    @Test
    void tan_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = tan(rawShort);

        assertEquals("tan(17)", expression.toString());
    }

    @Test
    void tan_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = tan(rawLong);

        assertEquals("tan(42)", expression.toString());
    }

    @Test
    void tan_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = tan(rawDouble);

        assertEquals("tan(45.123)", expression.toString());
    }

    @Test
    void tan_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = tan(rawFloat);

        assertEquals("tan(24.321)", expression.toString());
    }
}
