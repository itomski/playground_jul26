package de.lubowiecki.patterns.factory;

import java.time.LocalDate;

public class FactoryMethodTest {

    public static void main(String[] args) {

        AbstractRobotFactory factory = new KitchenRobotFactory();
        Robot robot = factory.setupAndGet();
        robot.doTheJob();

        // Auch eine Factory
        LocalDate date = LocalDate.now();

    }
}
