package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Acos.acos;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class AcosTest {
    @Test
    void acos_givenFieldName_createsAcosEvaluator() {
        StreamExpression expression = acos("someField");

        assertEquals("acos(someField)", expression.toString());
    }

    @Test
    void acos_givenRawInteger_createsAcosEvaluator() {
        int rawInt = 4;

        StreamExpression expression = acos(rawInt);

        assertEquals("acos(4)", expression.toString());
    }

    @Test
    void acos_givenRawShort_createsAcosEvaluator() {
        short rawShort = 17;

        StreamExpression expression = acos(rawShort);

        assertEquals("acos(17)", expression.toString());
    }

    @Test
    void acos_givenRawLong_createsAcosEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = acos(rawLong);

        assertEquals("acos(42)", expression.toString());
    }

    @Test
    void acos_givenRawDouble_createsAcosEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = acos(rawDouble);

        assertEquals("acos(45.123)", expression.toString());
    }

    @Test
    void acos_givenRawFloat_createsAcosEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = acos(rawFloat);

        assertEquals("acos(24.321)", expression.toString());
    }
}
