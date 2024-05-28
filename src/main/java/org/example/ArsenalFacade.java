package org.example;

import org.example.armament.Weapon;

import java.util.ArrayList;
import java.util.List;

public class ArsenalFacade {
    private List<Weapon> weapons;

    public ArsenalFacade() {
        weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Weapon weapon : weapons) {
            totalCost += weapon.getCost();
        }
        return totalCost;
    }

    public Weapon getMostExpensiveWeapon() {
        Weapon mostExpensive = null;
        double maxCost = 0;
        for (Weapon weapon : weapons) {
            if (weapon.getCost() > maxCost) {
                maxCost = weapon.getCost();
                mostExpensive = weapon;
            }
        }
        return mostExpensive;
    }

    public void applyDepreciation(int currentYear) {
        for (Weapon weapon : weapons) {
            int age = currentYear - weapon.getManufactureYear();
            weapon.setBaseCost(weapon.getBaseCost() * (1 - (age * 0.05)));
        }
    }
}
