package com.gmail.nossr50.datatypes.treasure;

public enum Rarity {
    RECORD,
    LEGENDARY,
    MYTHCIAL, // Adama change 1
    EPIC,
    RARE,
    UNCOMMON,
    COMMON,
    TRAP;

    public static Rarity getRarity(String string) {
        try {
            return valueOf(string);
        }
        catch (IllegalArgumentException ex) {
            return COMMON;
        }
    }
}
