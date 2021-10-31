package com.github.thesench.solr.dsl.stream.expr.params;

public enum RequestHandler {
    
    SELECT("/select"),
    EXPORT("/export");

    private final String requestHandler;

    private RequestHandler(String requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public String toString() {
        return requestHandler;
    }
}
