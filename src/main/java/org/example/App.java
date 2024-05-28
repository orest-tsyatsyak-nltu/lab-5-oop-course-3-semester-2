package org.example;

import org.example.armament.AssaultRifle;
import org.example.armament.Pistol;
import org.example.armament.Scope;
import org.example.armament.Silencer;
import org.example.armament.Weapon;

public class App {
    public static void main(String[] args) {
        ArsenalFacade arsenal = new ArsenalFacade();

        Weapon ak47 = new AssaultRifle("AK-47", 300, 30, 4.3, 700, 2020);
        Weapon m1911 = new Pistol("M1911", 50, 10, 1.1, 500, 2021);

        ak47 = new Scope(ak47, 100, 0.4);
        ak47 = new Silencer(ak47, 150, 0.3);

        arsenal.addWeapon(ak47);
        arsenal.addWeapon(m1911);

        ak47.validateWeight();
        m1911.validateWeight();

        System.out.println("Total cost of arsenal: $" + arsenal.calculateTotalCost());
        System.out.println("Most expensive weapon: " + arsenal.getMostExpensiveWeapon().getName());

        int currentYear = 2024;
        arsenal.applyDepreciation(currentYear);

        System.out.println("Total cost after depreciation: $" + arsenal.calculateTotalCost());
    }
}
