package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public abstract class Character {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected Weapon equippedWeapon;
    protected Armor equippedArmor;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
    }

    public void displayEquipment() {
        System.out.println("--- Equipment ---");
        if (equippedWeapon != null) {
            System.out.println("Weapon: " + equippedWeapon.getWeaponInfo());
            System.out.println("  Damage: " + equippedWeapon.getDamage());
        } else {
            System.out.println("Weapon: None");
        }
        if (equippedArmor != null) {
            System.out.println("Armor: " + equippedArmor.getArmorInfo());
            System.out.println("  Defense: " + equippedArmor.getDefense());
        } else {
            System.out.println("Armor: None");
        }
    }

    public abstract void displayStats();

    public abstract void useSpecialAbility();

    public abstract String getCharacterClass();
}
