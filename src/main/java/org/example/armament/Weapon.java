package org.example.armament;

public abstract class Weapon {
    protected String name;
    protected int range;
    protected int damage;
    protected double weight;
    protected double baseCost;
    //In kilos
    protected double maxAllowedWeight;
    protected int manufactureYear;

    protected Weapon(String name, int range, int damage, double weight, double baseCost, double maxAllowedWeight,
                     int manufactureYear) {
        this.name = name;
        this.range = range;
        this.damage = damage;
        this.weight = weight;
        this.baseCost = baseCost;
        this.maxAllowedWeight = maxAllowedWeight;
        this.manufactureYear = manufactureYear;
    }

    public abstract double getCost();

    public abstract double getWeight();

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getMaxAllowedWeight() {
        return maxAllowedWeight;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void validateWeight() {
        if (getWeight() > getMaxAllowedWeight()) {
            throw new IllegalStateException("Maximal allowed wait: %s, actual: %s"
                    .formatted(getMaxAllowedWeight(), getWeight())
            );
        }
    }
}
