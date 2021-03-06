package com.github.thesench.solr.dsl.stream.expr.decorators;

import static com.github.thesench.solr.dsl.stream.expr.evaluators.Abs.abs;
import static com.github.thesench.solr.dsl.stream.expr.params.ProductSort.productSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.thesench.solr.dsl.stream.expr.params.Field;
import com.github.thesench.solr.dsl.stream.expr.sources.Search;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CartesianProductTest {
    @Test
    void cartesianProduct_givenStreamAndFieldName_returnsCartesianProductStream() {
        String expected =
           "cartesianProduct(" +
                "search(testCollection)," +
                "someField" +
            ")";

        StreamExpression expression =
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
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
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
                "someField",
                productSort("someField asc", "someOtherField desc")
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamAndField_returnsCartesianProductStream() {
        Field someField = new Field("someField");
        String expected =
           "cartesianProduct(" +
                "search(testCollection)," +
                "someField" +
            ")";

        StreamExpression expression =
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
                someField
            );
        
        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamFieldAndSort_returnsCartesianProductStream() {
        Field someField = new Field("someField");
        Field someOtherField = new Field("someOtherField");
        String expected =
            "cartesianProduct(" +
                "search(testCollection)," +
                "someField," +
                "productSort=\"someField asc,someOtherField desc\"" +
            ")";

        StreamExpression expression =
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
                someField,
                productSort(someField.asc(), someOtherField.desc())
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
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
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
            CartesianProduct.cartesianProduct(
                Search.search("testCollection"),
                abs(12),
                productSort("someField ASC")
            );
        
        assertEquals(expected, expression.toString());
    }
}
