package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    private int damage;
    private String weaponType;
    private String range;

    public Longbow() {
        this.damage = 30;
        this.weaponType = "Bow";
        this.range = "Long";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - Precision bow for long-range combat (Range: " + range + ")";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    public String getRange() {
        return range;
    }
}
