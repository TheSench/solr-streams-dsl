package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Factorial.factorial;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void factorial_givenFieldName_createsHsinEvaluator() {
        StreamExpression expression = factorial("someField");

        assertEquals("factorial(someField)", expression.toString());
    }

    @Test
    void factorial_givenRawInteger_createsHsinEvaluator() {
        int rawInt = 4;

        StreamExpression expression = factorial(rawInt);

        assertEquals("factorial(4)", expression.toString());
    }

    @Test
    void factorial_givenRawShort_createsHsinEvaluator() {
        short rawShort = 17;

        StreamExpression expression = factorial(rawShort);

        assertEquals("factorial(17)", expression.toString());
    }

    @Test
    void factorial_givenRawLong_createsHsinEvaluator() {
        long rawLong = 42L;
        StreamExpression expression = factorial(rawLong);

        assertEquals("factorial(42)", expression.toString());
    }

    @Test
    void factorial_givenRawDouble_createsHsinEvaluator() {
        double rawDouble = 45.123;

        StreamExpression expression = factorial(rawDouble);

        assertEquals("factorial(45.123)", expression.toString());
    }

    @Test
    void factorial_givenRawFloat_createsHsinEvaluator() {
        float rawFloat = 24.321F;

        StreamExpression expression = factorial(rawFloat);

        assertEquals("factorial(24.321)", expression.toString());
    }
}
