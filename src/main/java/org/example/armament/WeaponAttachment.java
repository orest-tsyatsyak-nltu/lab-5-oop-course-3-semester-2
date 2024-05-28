package org.example.armament;

public abstract class WeaponAttachment extends Weapon {
    protected Weapon modifiedWeapon;

    protected WeaponAttachment(Weapon modifiedWeapon) {
        super(modifiedWeapon.getName(), modifiedWeapon.getRange(), modifiedWeapon.getDamage(),
                modifiedWeapon.getWeight(), modifiedWeapon.getBaseCost(), modifiedWeapon.getMaxAllowedWeight(),
                modifiedWeapon.getManufactureYear());
        this.modifiedWeapon = modifiedWeapon;
    }

    @Override
    public double getCost() {
        return modifiedWeapon.getCost();
    }

    @Override
    public double getWeight() {
        return modifiedWeapon.getWeight();
    }
}
