package lordOfTheRing.Hero;

import lordOfTheRing.enemy.Enemy;
import lordOfTheRing.weaponService.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Attack " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
