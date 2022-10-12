package lordOfTheRing.Hero;

import lordOfTheRing.enemy.Enemy;
import lordOfTheRing.weaponService.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {


    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Attack " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
