package com.tracker.models.enums;

public enum Size {
    // Define enum constants with custom display values
    ZERO_TO_THREE_MONTHS("0-3 months"),
    THREE_TO_SIX_MONTHS("3-6 months"),
    SIX_TO_TWELVE_MONTHS("6-12 months"),
    TWELVE_TO_EIGHTEEN_MONTHS("12-18 months"),
    EIGHTEEN_TO_TWENTY_FOUR_MONTHS("18-24 months"),
    TWO_T("2T"),
    THREE_T("3T"),
    FOUR_T("4T"),
    FIVE("5"),
    SIX("6");


    // Custom field to store the display name
    private final String displayName;

    // Enum constructor
    Size(String displayName) {
        this.displayName = displayName;
    }

    // Getter for the display name
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
