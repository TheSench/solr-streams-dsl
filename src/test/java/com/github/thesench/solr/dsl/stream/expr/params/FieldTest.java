package com.github.thesench.solr.dsl.stream.expr.params;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FieldTest {
    @Test
    void constructor_setsValueToFeildName() {
        Field field = new Field("someField");

        assertEquals("someField", field.getValue());
    }

    @Test
    void as_createsAliasWithFieldName() {
        Field field = new Field("someField");

        Alias alias = field.as("someAlias");

        assertEquals("someField as someAlias", alias.format(AliasType.AS).getValue());
        assertEquals("someAlias:someField", alias.format(AliasType.COLON).getValue());
    }

    @Test
    void asc_createsSortFieldInAscendingOrder() {
        Field field = new Field("someField");

        SortFields sort = field.asc();

        assertEquals("someField asc", sort.toString());
    }

    @Test
    void desc_createsSortFieldInDescendingOrder() {
        Field field = new Field("someField");

        SortFields sort = field.desc();

        assertEquals("someField desc", sort.toString());
    }
}
