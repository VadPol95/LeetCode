package lordOfTheRing.weaponService.impl;

import lordOfTheRing.weaponService.MeleeWeapon;

public class Sword implements MeleeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }
}
