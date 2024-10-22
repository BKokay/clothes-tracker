package com.tracker.models.enums;

public enum Gender {
    GIRL("girl"),
    BOY("boy"),
    NEUTRAL("neutral");

    private final String displayName;

    Gender(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString(){
        return displayName;
    }
}
