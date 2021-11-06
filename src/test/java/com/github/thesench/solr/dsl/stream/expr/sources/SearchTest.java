package com.github.thesench.solr.dsl.stream.expr.sources;

import static com.github.thesench.solr.dsl.stream.expr.params.RequestHandler.EXPORT;
import static com.github.thesench.solr.dsl.stream.expr.params.SortDirection.ASC;
import static com.github.thesench.solr.dsl.stream.expr.params.SortDirection.DESC;
import static com.github.thesench.solr.dsl.stream.expr.params.SortFields.by;
import static com.github.thesench.solr.dsl.stream.expr.params.FL.fl;
import static com.github.thesench.solr.dsl.stream.expr.params.Q.q;
import static com.github.thesench.solr.dsl.stream.expr.params.QT.qt;
import static com.github.thesench.solr.dsl.stream.expr.params.Rows.rows;
import static com.github.thesench.solr.dsl.stream.expr.params.Sort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SearchTest {
    @Test
    void search_withOnlyCollection() {
        StreamExpression expression = Search.search("someCollection");

        assertEquals("search(someCollection)", expression.toString());
    }

    @Test
    void search_withStandardSearchParams() {
        String expected =
            "search(" +
                "someCollection,"+
                "q=\"someField:someValue\"," +
                "fl=\"field1,field2,field3 as someAlias\"," +
                "sort=\"field1 asc,field2 desc\"," +
                "rows=5," +
                "qt=\"/export\"" +
            ")";

        StreamExpression expression =
            Search.search(
                "someCollection",
                q("someField:someValue"),
                fl("field1", "field2", "field3 as someAlias"),
                sort(by("field1", ASC).thenBy("field2", DESC)),
                rows(5),
                qt(EXPORT)
            );
        assertEquals(expected, expression.toString());
    }
}
