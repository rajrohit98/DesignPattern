package StrategyPattern;

import StrategyPattern.Bikes.MountainBike;
import StrategyPattern.Bikes.RoadVehicle;
import StrategyPattern.Bikes.SportsBike;
import StrategyPattern.Bikes.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle bike1 = new RoadVehicle();
        bike1.message();

        Vehicle bike2 = new MountainBike();
        bike2.message();

        Vehicle bike3 = new SportsBike();
        bike3.message();

    }
}
