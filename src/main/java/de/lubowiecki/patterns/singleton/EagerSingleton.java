package de.lubowiecki.patterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private double zahl;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void addToZahl(double zahl) {
        this.zahl += zahl;
    }

    public double getZahl() {
        return zahl;
    }
}
