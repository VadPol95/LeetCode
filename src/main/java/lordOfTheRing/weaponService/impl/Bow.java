package lordOfTheRing.weaponService.impl;

import lordOfTheRing.weaponService.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 15;
    }
}
