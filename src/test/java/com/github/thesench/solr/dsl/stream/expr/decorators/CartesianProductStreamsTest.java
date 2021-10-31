package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.decorators.StreamDecorators.cartesianProduct;
import static com.github.thesench.solr.dsl.stream.expr.evaluators.StreamEvaluators.abs;
import static com.github.thesench.solr.dsl.stream.expr.params.SortDirection.ASC;
import static com.github.thesench.solr.dsl.stream.expr.params.SortDirection.DESC;
import static com.github.thesench.solr.dsl.stream.expr.params.SortFields.by;
import static com.github.thesench.solr.dsl.stream.expr.params.StreamParameters.productSort;
import static com.github.thesench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CartesianProductStreamsTest {
    @Test
    void cartesianProduct_givenStreamAndFieldName_returnsCartesianProductStream() {
        String expected =
           "cartesianProduct(" +
                "search(testCollection)," +
                "someField" +
            ")";

        StreamExpression expression =
            cartesianProduct(
                search("testCollection"),
                "someField"
            );
        
        assertEquals(expected, expression.toString());
    }
    @Test
    void cartesianProduct_givenStreamFieldNameAndSort_returnsCartesianProductStream() {
        String expected =
            "cartesianProduct(" +
                "search(testCollection)," +
                "someField," +
                "productSort=\"someField asc,someOtherField desc\"" +
            ")";

        StreamExpression expression =
            cartesianProduct(
                search("testCollection"),
                "someField",
                productSort(by("someField", ASC).thenBy("someOtherField", DESC))
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamAndEvaluator_returnsCartesianProductStream() {
        String expected =  
            "cartesianProduct(" +
                "search(testCollection)," +
                "abs(12)" +
            ")";

        StreamExpression expression = 
            cartesianProduct(
                search("testCollection"),
                abs(12)
            );

        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamEvaluatorAndSort_returnsCartesianProductStream() {
        String expected =
        "cartesianProduct(" +
            "search(testCollection)," +
            "abs(12)," +
            "productSort=\"someField ASC\"" +
        ")";
        
        StreamExpression expression =
            cartesianProduct(
                search("testCollection"),
                abs(12),
                productSort("someField ASC")
            );
        
        assertEquals(expected, expression.toString());
    }
}
