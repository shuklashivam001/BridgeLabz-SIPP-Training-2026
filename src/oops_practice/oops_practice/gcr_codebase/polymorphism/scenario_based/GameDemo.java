package oops_practice.oops_practice.gcr_codebase.polymorphism.scenario_based;

class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends GameCharacter {

    Warrior(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

class Archer extends GameCharacter {

    Archer(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Bow");
    }
}

public class GameDemo {

    static void startBattle(GameCharacter[] characters) {

        int warrior = 0;
        int mage = 0;
        int archer = 0;

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warrior++;
            else if (c instanceof Mage)
                mage++;
            else if (c instanceof Archer)
                archer++;
        }

        System.out.println("\nWarriors = " + warrior);
        System.out.println("Mages = " + mage);
        System.out.println("Archers = " + archer);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Arjun"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Bhim")
        };

        startBattle(characters);
    }
}