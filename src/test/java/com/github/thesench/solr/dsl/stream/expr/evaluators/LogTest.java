package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Log.log;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class LogTest {
    @Test
    void log_givenFieldName_createsLogEvaluator() {
        StreamExpression expression = log("someField");

        assertEquals("log(someField)", expression.toString());
    }

    @Test
    void log_givenRawInteger_createsLogEvaluator() {
        int rawInt = 4;

        StreamExpression expression = log(rawInt);

        assertEquals("log(4)", expression.toString());
    }

    @Test
    void log_givenRawShort_createsLogEvaluator() {
        short rawShort = 17;

        StreamExpression expression = log(rawShort);

        assertEquals("log(17)", expression.toString());
    }

    @Test
    void log_givenRawLong_createsLogEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = log(rawLong);

        assertEquals("log(42)", expression.toString());
    }

    @Test
    void log_givenRawDouble_createsLogEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = log(rawDouble);

        assertEquals("log(45.123)", expression.toString());
    }

    @Test
    void log_givenRawFloat_createsLogEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = log(rawFloat);

        assertEquals("log(24.321)", expression.toString());
    }
}
