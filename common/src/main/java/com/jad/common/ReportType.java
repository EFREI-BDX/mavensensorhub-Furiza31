package com.jad.common;

public enum ReportType {
    TEXT("Text"),
    CSV("CSV");

    private final String name;

    ReportType(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
