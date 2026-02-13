package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String armorType;
    private int agilityBonus;

    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Light Armor";
        this.agilityBonus = 15;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Lightweight armor for swift movement (Agility Bonus: " + agilityBonus + ")";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }
}
