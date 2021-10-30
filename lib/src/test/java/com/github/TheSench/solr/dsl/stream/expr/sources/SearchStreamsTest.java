package com.github.TheSench.solr.dsl.stream.expr.sources;

import static com.github.TheSench.solr.dsl.stream.expr.params.FieldListClause.fl;
import static com.github.TheSench.solr.dsl.stream.expr.sources.RequestHandler.EXPORT;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.q;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.qt;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.rows;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.search;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SearchStreams.sort;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortDirection.ASC;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortDirection.DESC;
import static com.github.TheSench.solr.dsl.stream.expr.sources.SortFields.by;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.solr.client.solrj.io.stream.expr.StreamExpression;
import org.junit.jupiter.api.Test;

public class SearchStreamsTest {
    @Test
    void search_withOnlyCollection() {
        StreamExpression expression = search("someCollection");

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
            search(
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
