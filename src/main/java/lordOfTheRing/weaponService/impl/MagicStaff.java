package lordOfTheRing.weaponService.impl;

import lordOfTheRing.weaponService.MagicWeapon;

public class MagicStaff implements MagicWeapon {
    @Override
    public int getDamage() {
        return 20;
    }
}
