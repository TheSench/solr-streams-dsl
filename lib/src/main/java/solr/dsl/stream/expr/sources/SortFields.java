package solr.dsl.stream.expr.sources;

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
        String field;
        SortDirection sortDirection;
        SortField nextSortField;
    
        SortField(String field, SortDirection sortDirection) {
            this.field = field;
            this.sortDirection = sortDirection;
        }
    
        public void setNextSortField(SortField nextSortField) {
            this.nextSortField = nextSortField;
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