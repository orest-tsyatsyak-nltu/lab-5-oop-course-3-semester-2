package org.example.armament;

public class Rifle extends Weapon {
    public Rifle(String name, int range, int damage, double weight, double baseCost, int manufactureYear) {
        super(name, range, damage, weight, baseCost, 5, manufactureYear);
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
