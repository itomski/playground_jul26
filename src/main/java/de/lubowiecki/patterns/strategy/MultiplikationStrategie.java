package de.lubowiecki.patterns.strategy;

public class MultiplikationStrategie implements RechnerStrategie {

    @Override
    public double ausfuehren(double a, double b) {
        return a * b;
    }
}
