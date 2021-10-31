package com.github.thesench.solr.dsl.stream.expr.params;

public enum SortDirection {
    
    ASC("asc"),
    DESC("desc");

    private final String sortDirection;

    private SortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public String toString() {
        return sortDirection;
    }
}
