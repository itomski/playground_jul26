package de.lubowiecki.patterns.factory;

public class KitchenRobotFactory extends AbstractRobotFactory {

    @Override
    protected Robot create() {
        return new KitchenRobot();
    }
}
