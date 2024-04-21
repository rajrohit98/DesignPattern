package StrategyPattern.Bikes;

import StrategyPattern.BikeEdition.BikeEdition;

public class Vehicle {

    private final BikeEdition obj;

    public Vehicle(BikeEdition obj) {
        this.obj = obj;
    }

    public void message() {
        obj.edition();
    }
}
