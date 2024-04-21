package StrategyPattern.Bikes;

import StrategyPattern.BikeEdition.SpecialEdition;

public class MountainBike extends Vehicle {
    public MountainBike() {
        super(new SpecialEdition());
    }
}
