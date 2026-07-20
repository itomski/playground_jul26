package de.lubowiecki.patterns.singleton;

public class LazySigleton {

    private static LazySigleton instance;

    private double zahl;

    private LazySigleton() {
    }

    public static LazySigleton getInstance() {
        if (instance == null) {
            synchronized (LazySigleton.class) {
                if (instance == null) {
                    instance = new LazySigleton();
                }
            }
        }
        return instance;
    }

    public void addToZahl(double zahl) {
        this.zahl += zahl;
    }

    public double getZahl() {
        return zahl;
    }

}
