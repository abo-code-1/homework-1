package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String weaponType;
    private int manaBoost;

    public WizardStaff() {
        this.damage = 15;
        this.weaponType = "Staff";
        this.manaBoost = 20;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Arcane staff that channels magical energy (Mana Boost: " + manaBoost + ")";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    public int getManaBoost() {
        return manaBoost;
    }
}
