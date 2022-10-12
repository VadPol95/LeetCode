package lordOfTheRing;

import lordOfTheRing.Hero.*;
import lordOfTheRing.enemy.Enemy;

public class TrainingGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Legolas", 20);
        Mage mage = new Mage("Gendalf", 25);
        Warrior warrior = new Warrior("Aragorn", 15);
        Enemy zombie = new Enemy("Zombie", 100);


        attack(zombie, archer, mage, warrior);

    }

    public static void attack(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.getHealth() <= 0) {
                    System.out.println("Zombie died");
                } else {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
