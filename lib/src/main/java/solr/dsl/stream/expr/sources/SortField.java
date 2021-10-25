package solr.dsl.stream.expr.sources;

public class SortField {
    String field;
    SortDirection sortDirection;
    SortField nextSortField;

    SortField(String field, SortDirection sortDirection) {
        this.field = field;
        this.sortDirection = sortDirection;
    }

    public SortField thenBy(SortField nextSortField) {
        this.nextSortField = nextSortField;
        return nextSortField;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        appendSelf(stringBuilder);
        return stringBuilder.toString();
    }
}