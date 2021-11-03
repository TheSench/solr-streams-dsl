package com.github.thesench.solr.dsl.stream.expr.params;

public class SortFields {
    String field;
    SortDirection sortDirection;
    SortField firstSortField;
    SortField lastSortField;

    SortFields(SortField sortField) {
        this.firstSortField = sortField;
        this.lastSortField = sortField;
    }

    public static SortFields by(String field, SortDirection sortDirection) {
        SortField sortField = new SortField(field, sortDirection);
        return new SortFields(sortField);
    }

    public SortFields thenBy(String field, SortDirection sortDirection) {
        SortField sortField = new SortField(field, sortDirection);
        lastSortField.nextSortField = sortField;
        lastSortField = sortField;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        firstSortField.appendSelf(stringBuilder);
        return stringBuilder.toString();
    }

    private static class SortField {
        private final String field;
        private final SortDirection sortDirection;
        private SortField nextSortField;
    
        SortField(String field, SortDirection sortDirection) {
            this.field = field;
            this.sortDirection = sortDirection;
        }
    
        public void appendSelf(StringBuilder stringBuilder) {
            stringBuilder.append(field);
            stringBuilder.append(' ');
            stringBuilder.append(sortDirection.toString());
            if (nextSortField != null) {
                stringBuilder.append(',');
                nextSortField.appendSelf(stringBuilder);
            }
        }
    }
}