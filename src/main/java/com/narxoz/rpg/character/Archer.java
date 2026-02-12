package com.narxoz.rpg.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name);
        this.health = 100;
        this.mana = 60;
        this.strength = 50;
        this.intelligence = 50;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (" + getCharacterClass() + ") ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses PRECISION SHOT! Guaranteed critical hit!");
    }

    @Override
    public String getCharacterClass() {
        return "Archer";
    }
}
