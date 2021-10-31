package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.StreamEvaluators.abs;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AbsTest {
    @Test
    void abs_givenFieldName_createsAbsEvaluator() {
        StreamExpression expression = abs("someField");

        assertEquals("abs(someField)", expression.toString());
    }

    @Test
    void abs_givenRawInteger_createsAbsEvaluator() {
        int rawInt = 4;

        StreamExpression expression = abs(rawInt);

        assertEquals("abs(4)", expression.toString());
    }

    @Test
    void abs_givenRawShort_createsAbsEvaluator() {
        short rawShort = 17;

        StreamExpression expression = abs(rawShort);

        assertEquals("abs(17)", expression.toString());
    }

    @Test
    void abs_givenRawLong_createsAbsEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = abs(rawLong);

        assertEquals("abs(42)", expression.toString());
    }

    @Test
    void abs_givenRawDouble_createsAbsEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = abs(rawDouble);

        assertEquals("abs(45.123)", expression.toString());
    }

    @Test
    void abs_givenRawFloat_createsAbsEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = abs(rawFloat);

        assertEquals("abs(24.321)", expression.toString());
    }
}
