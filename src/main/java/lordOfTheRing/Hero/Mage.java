package lordOfTheRing.Hero;

import lordOfTheRing.enemy.Enemy;
import lordOfTheRing.weaponService.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{


    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Attack " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
