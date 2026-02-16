package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String armorType;
    private int manaBoost;

    public EnchantedRobes() {
        this.defense = 10;
        this.armorType = "Robes";
        this.manaBoost = 25;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Mystical robes woven with arcane threads (Mana Boost: " + manaBoost + ")";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    public int getManaBoost() {
        return manaBoost;
    }
}
