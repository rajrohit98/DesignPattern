package StrategyPattern.Bikes;

import StrategyPattern.BikeEdition.NormalEdition;

public class RoadVehicle extends Vehicle {
    public RoadVehicle() {
        super( new NormalEdition());
    }
}
