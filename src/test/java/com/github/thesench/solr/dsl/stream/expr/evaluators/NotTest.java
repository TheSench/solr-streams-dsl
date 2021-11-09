package com.github.thesench.solr.dsl.stream.expr.evaluators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.And.and;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.Not.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class NotTest {
    
    @Test
    void not_givenFieldNotField_returnsNotExpression() {
        Field someField = new Field("someField");

        StreamExpression expression = not(someField);

        assertEquals("not(someField)", expression.toString());
    }
    
    @Test
    void not_givenFieldNotBooleanEvaluator_returnsNotExpression() {
        BooleanEvaluator evaluator = and(true, true);

        StreamExpression expression = not(evaluator);

        assertEquals("not(and(true,true))", expression.toString());
    }
    
    @Test
    void not_givenFieldNotBoolean_returnsNotExpression() {
        StreamExpression expression = not(true);

        assertEquals("not(true)", expression.toString());
    }
}
