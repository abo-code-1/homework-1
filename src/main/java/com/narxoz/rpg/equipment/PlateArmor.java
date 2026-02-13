package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;

    public PlateArmor() {
        this.defense = 30;
        this.armorType = "Heavy Armor";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Heavy iron plates providing maximum protection";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }
}
