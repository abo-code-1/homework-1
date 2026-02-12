package com.narxoz.rpg.character;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
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
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override
    public String getCharacterClass() {
        return "Warrior";
    }
}
