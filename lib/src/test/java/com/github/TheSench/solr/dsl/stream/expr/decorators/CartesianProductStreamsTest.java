package com.github.TheSench.solr.dsl.stream.expr.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.TheSench.solr.dsl.stream.expr.decorators.CartesianProductStreams.cartesianProduct;
import static com.github.TheSench.solr.dsl.stream.expr.decorators.CartesianProductStreams.productSort;
import static com.github.TheSench.solr.dsl.stream.expr.evaluators.AbsEvaluators.abs;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortDirection.ASC;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortDirection.DESC;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortFields.by;

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
