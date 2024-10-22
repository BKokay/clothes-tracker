package com.tracker.models.enums;

public enum Type {
    LEGGINGS("leggings"),
    THERMAL_LEGGINGS("thermal leggings"),
    CAPRI_LEGGINGS("capri length leggings"),
    THICK_LEGGINGS("thick leggings"),
    SHORTS("shorts"),
    JEAN_SHORTS("jean shorts"),
    JEANS("jeans"),
    PANTS("pants"),
    UNDER_SHIRT_SLEEVELESS("sleeveless under shirt"),
    UNDER_SHIRT_SHORT("short sleeve under shirt"),
    UNDER_SHIRT_LONG("long sleeve under shirt"),
    LONG_SLEEVE_SHIRT("long sleeve shirt"),
    SHORT_SLEEVE_SHIRT("short sleeve shirt"),
    SLEEVELESS_SHIRT("sleeveless shirt"),
    SWEATER("sweater"),
    SWEAT_SHIRT("sweat shirt"),
    PYJAMA_BUTTON("button up pyjama"),
    PYJAMA_ZIP("zip up pyjama"),
    PYJAMA_TWO_PIECE("two piece pyjama"),
    JACKET_LIGHT("Light weight jacket"),
    JACKET_RAIN("rain jacket"),
    JACKET_WIND("wind jacket"),
    COAT_HEAVY("heavy coat"),
    COAT_MID("medium weight coat"),
    SOCKS_ANKLE("ankle socks"),
    SOCK_MID("mid-length socks"),
    SOCKS_HEAVY("heavy weight socks");

    private final String displayName;

    Type(String displayName){
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
