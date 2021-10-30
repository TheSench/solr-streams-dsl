package com.github.TheSench.solr.dsl.stream.expr.sources;

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
