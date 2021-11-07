package com.github.thesench.solr.dsl.stream.expr.params;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SortFieldsTest {
    @Test
    void by_givenFieldNameAndAscending_createsProperSortExpression() {
        SortFields sortFields = SortFields.by("someField", SortDirection.ASC);

        assertEquals("someField asc", sortFields.toString());
    }

    @Test
    void by_givenFieldNameAndDescending_createsProperSortExpression() {
        SortFields sortFields = SortFields.by("someField", SortDirection.DESC);

        assertEquals("someField desc", sortFields.toString());
    }

    @Test
    void by_givenFieldAndAscending_createsProperSortExpression() {
        Field someField = new Field("someField");
        SortFields sortFields = SortFields.by(someField, SortDirection.ASC);

        assertEquals("someField asc", sortFields.toString());
    }

    @Test
    void by_givenFieldAndDescending_createsProperSortExpression() {
        Field someField = new Field("someField");
        SortFields sortFields = SortFields.by(someField, SortDirection.DESC);

        assertEquals("someField desc", sortFields.toString());
    }
    
    @Test
    void thenBy_givenFieldNameAndAscending_createsProperSortExpression() {
        SortFields sortFields = SortFields.by("someField", SortDirection.ASC)
                                    .thenBy("anotherField", SortDirection.ASC);

        assertEquals("someField asc,anotherField asc", sortFields.toString());
    }

    @Test
    void thenBy_givenFieldNameAndDescending_createsProperSortExpression() {
        SortFields sortFields = SortFields.by("someField", SortDirection.ASC)
                                    .thenBy("anotherField", SortDirection.DESC);

        assertEquals("someField asc,anotherField desc", sortFields.toString());
    }

    @Test
    void thenBy_givenFieldAndAscending_createsProperSortExpression() {
        Field anotherField = new Field("anotherField");
        SortFields sortFields = SortFields.by("someField", SortDirection.ASC)
                                    .thenBy(anotherField, SortDirection.ASC);

        assertEquals("someField asc,anotherField asc", sortFields.toString());
    }

    @Test
    void thenBy_givenFieldAndDescending_createsProperSortExpression() {
        Field anotherField = new Field("anotherField");
        SortFields sortFields = SortFields.by("someField", SortDirection.ASC)
                                    .thenBy(anotherField, SortDirection.DESC);

        assertEquals("someField asc,anotherField desc", sortFields.toString());
    }

    @Test
    void thenBy_givenAnotherSortFields_createsProperSortExpression() {
        Field someField = new Field("someField");
        Field anotherField = new Field("anotherField");
        SortFields sortFields = someField.asc()
                                    .thenBy(anotherField.desc());

        assertEquals("someField asc,anotherField desc", sortFields.toString());
    }
}
