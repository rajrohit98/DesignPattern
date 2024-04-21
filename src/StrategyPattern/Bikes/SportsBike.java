package StrategyPattern.Bikes;

import StrategyPattern.BikeEdition.SpecialEdition;

public class SportsBike extends Vehicle {
    public SportsBike() {
        super(new SpecialEdition());
    }
}
