package com.github.thesench.solr.dsl.stream.expr.params;

public class SortedField {
    private final String field;
    private final SortDirection sortDirection;

    SortedField(String field, SortDirection sortDirection) {
        this.field = field;
        this.sortDirection = sortDirection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        appendSelf(sb);
        return sb.toString();
    }

    public void appendSelf(StringBuilder stringBuilder) {
        stringBuilder.append(field);
        stringBuilder.append(' ');
        stringBuilder.append(sortDirection.toString());
    }
}