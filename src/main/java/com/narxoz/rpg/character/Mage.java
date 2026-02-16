package com.narxoz.rpg.character;

public class Mage extends Character {

    public Mage(String name) {
        super(name);
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
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
        System.out.println(name + " uses ARCANE BLAST! Unleashing powerful magic damage!");
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
    }
}
