package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Cbrt.cbrt;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CbrtTest {
    @Test
    void cbrt_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = cbrt("someField");

        assertEquals("cbrt(someField)", expression.toString());
    }

    @Test
    void cbrt_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = cbrt(rawInt);

        assertEquals("cbrt(4)", expression.toString());
    }

    @Test
    void cbrt_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = cbrt(rawShort);

        assertEquals("cbrt(17)", expression.toString());
    }

    @Test
    void cbrt_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = cbrt(rawLong);

        assertEquals("cbrt(42)", expression.toString());
    }

    @Test
    void cbrt_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = cbrt(rawDouble);

        assertEquals("cbrt(45.123)", expression.toString());
    }

    @Test
    void cbrt_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = cbrt(rawFloat);

        assertEquals("cbrt(24.321)", expression.toString());
    }
}
