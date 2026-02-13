package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.WarriorFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MedievalEquipmentFactory;
import com.narxoz.rpg.factory.MagicEquipmentFactory;
import com.narxoz.rpg.factory.RangerEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        System.out.println("--- Factory Method Pattern: Character Creation ---\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("Thor");
        Character mage = mageFactory.createCharacter("Gandalf");
        Character archer = archerFactory.createCharacter("Legolas");

        System.out.println("--- Abstract Factory Pattern: Equipment Creation ---\n");

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();

        System.out.println("--- Equipping Characters ---\n");

        equipCharacter(warrior, medievalFactory);
        equipCharacter(mage, magicFactory);
        equipCharacter(archer, rangerFactory);

        System.out.println("--- Character Details ---\n");

        displayCharacterInfo(warrior);
        displayCharacterInfo(mage);
        displayCharacterInfo(archer);

        System.out.println("--- Special Abilities Demo ---\n");

        warrior.useSpecialAbility();
        mage.useSpecialAbility();
        archer.useSpecialAbility();

        System.out.println("\n=== Demo Complete ===");
    }

    private static void equipCharacter(Character character, EquipmentFactory factory) {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        character.equipWeapon(weapon);
        character.equipArmor(armor);

        System.out.println(character.getName() + " equipped with themed gear!");
    }

    private static void displayCharacterInfo(Character character) {
        character.displayStats();
        character.displayEquipment();
        System.out.println();
    }
}
