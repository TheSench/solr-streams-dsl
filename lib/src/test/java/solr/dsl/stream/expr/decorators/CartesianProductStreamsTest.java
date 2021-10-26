package solr.dsl.stream.expr.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static solr.dsl.stream.expr.decorators.CartesianProductStreams.cartesianProduct;
import static solr.dsl.stream.expr.decorators.CartesianProductStreams.productSort;
import static solr.dsl.stream.expr.evaluators.AbsEvaluators.abs;
import static solr.dsl.stream.expr.sources.SearchStreams.search;
import static solr.dsl.stream.expr.sources.SearchStreams.sort;
import static solr.dsl.stream.expr.sources.SortFields.by;
import static solr.dsl.stream.expr.sources.SortDirection.ASC;
import static solr.dsl.stream.expr.sources.SortDirection.DESC;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class CartesianProductStreamsTest {
    @Test
    void cartesianProduct_givenStreamAndFieldName_returnsCartesianProductStream() {
        StreamExpression expression = cartesianProduct(
                                            search("testCollection"),
                                            "someField"
                                        );
        
        String expected =   "cartesianProduct(" +
                                "search(testCollection)," +
                                "someField" +
                            ")";
        assertEquals(expected, expression.toString());
    }
    @Test
    void cartesianProduct_givenStreamFieldNameAndSort_returnsCartesianProductStream() {
        StreamExpression expression = cartesianProduct(
                                            search("testCollection"),
                                            "someField",
                                            productSort(by("someField", ASC).thenBy("someOtherField", DESC))
                                        );
        
        String expected =   "cartesianProduct(" +
                                "search(testCollection)," +
                                "someField," +
                                "productSort=\"someField asc,someOtherField desc\"" +
                            ")";
        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamAndEvaluator_returnsCartesianProductStream() {
        StreamExpression expression = cartesianProduct(
                                            search("testCollection"),
                                            abs(12)
                                        );
        
        String expected =   "cartesianProduct(" +
                                "search(testCollection)," +
                                "abs(12)" +
                            ")";
        assertEquals(expected, expression.toString());
    }

    @Test
    void cartesianProduct_givenStreamEvaluatorAndSort_returnsCartesianProductStream() {
        StreamExpression expression = cartesianProduct(
                                            search("testCollection"),
                                            abs(12),
                                            productSort("someField ASC")
                                        );
        
        String expected =   "cartesianProduct(" +
                                "search(testCollection)," +
                                "abs(12)," +
                                "productSort=\"someField ASC\"" +
                            ")";
        assertEquals(expected, expression.toString());
    }
}
