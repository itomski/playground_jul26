package de.lubowiecki.patterns.strategy;

public class DivisionStrategie implements RechnerStrategie {

    @Override
    public double ausfuehren(double a, double b) {
        return a / b;
    }
}
