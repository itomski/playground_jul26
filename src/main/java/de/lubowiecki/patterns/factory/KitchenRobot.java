package de.lubowiecki.patterns.factory;

public class KitchenRobot implements Robot {

    @Override
    public void setup() {
        System.out.println("KitchenRobot setup");
    }

    @Override
    public void doTheJob() {
        System.out.println("KitchenRobot doTheJob");
    }
}
