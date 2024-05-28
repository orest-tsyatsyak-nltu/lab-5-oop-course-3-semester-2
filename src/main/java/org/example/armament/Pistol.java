package org.example.armament;

public class Pistol extends Weapon {
    public Pistol(String name, int range, int damage, double weight, double baseCost, int manufactureYear) {
        super(name, range, damage, weight, baseCost, 1.5, manufactureYear);
    }

    @Override
    public double getCost() {
        return baseCost;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
