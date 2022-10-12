package lordOfTheRing;

import lordOfTheRing.Hero.Archer;
import lordOfTheRing.Hero.Hero;
import lordOfTheRing.Hero.Mage;
import lordOfTheRing.Hero.Warrior;
import lordOfTheRing.weaponService.Weapon;
import lordOfTheRing.weaponService.impl.Bow;
import lordOfTheRing.weaponService.impl.MagicStaff;
import lordOfTheRing.weaponService.impl.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> legolas = new Archer<>("Legolas", 15);
        legolas.setWeapon(new Bow());
        Warrior<Sword> aragorn = new Warrior<>("Aragorn", 10);
        aragorn.setWeapon(new Sword());
        Mage<MagicStaff> gendalf = new Mage<>("Gendalf", 20);
        gendalf.setWeapon(new MagicStaff());

        printWeaponDamage(legolas);
        printWeaponDamage(aragorn);
        printWeaponDamage(gendalf);
    }
    public static<T extends Weapon> void printWeaponDamage(Hero<T> hero){
        System.out.println(hero.getWeapon().getDamage());
    }
}
