package org.example.armament;

public class Scope extends WeaponAttachment {
    private double cost;
    private double weight;

    public Scope(Weapon decoratedWeapon, double cost, double weight) {
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
