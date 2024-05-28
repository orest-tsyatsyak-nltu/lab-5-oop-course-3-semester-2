package org.example.armament;

public class Silencer extends WeaponAttachment {
    private double cost;
    private double weight;

    public Silencer(Weapon decoratedWeapon, double cost, double weight) {
        super(decoratedWeapon);
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public double getCost() {
        return modifiedWeapon.getCost() + cost;
    }

    @Override
    public double getWeight() {
        return modifiedWeapon.getWeight() + weight;
    }
}
