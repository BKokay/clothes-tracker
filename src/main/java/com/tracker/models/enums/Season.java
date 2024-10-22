package com.tracker.models.enums;

public enum Season {
    SPRING("spring"),
    SUMMER("summer"),
    FALL("fall"),
    WINTER("winter"),
    ALL_SEASONS("all");

    private final String displayName;

    Season(String displayName) {
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
