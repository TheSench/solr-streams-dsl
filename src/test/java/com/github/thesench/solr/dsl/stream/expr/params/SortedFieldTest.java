package com.github.thesench.solr.dsl.stream.expr.params;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SortedFieldTest {
    @Test
    void appendSelf_appends_field_and_direction() {
        SortedField sortedField = new SortedField("someField", SortDirection.ASC);

        StringBuilder sb = new StringBuilder();
        sortedField.appendSelf(sb);

        assertEquals("someField asc", sb.toString());
    }
}
