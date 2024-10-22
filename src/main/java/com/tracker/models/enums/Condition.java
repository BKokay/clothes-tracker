package com.tracker.models.enums;

public enum Condition {
    NEW("new"),
    GOOD("good"),
    OKAY("okay"),
    DAMAGED("damaged");

    private final String displayName;

    Condition(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
