package de.lubowiecki.patterns.decorator;

public class BasicHero implements Hero {

    @Override
    public void userSpecialForce() {
        System.out.println("Basic Hero: benutzt besondere Fähigkeiten");
    }
}
