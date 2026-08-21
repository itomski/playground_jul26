package de.lubowiecki.patterns.strategy;

public class Rechner {

    private final RechnerStrategie strategie;

    public Rechner(RechnerStrategie strategie) {
        this.strategie = strategie;
    }

    public double ausfuehren(double a, double b) {
        return strategie.ausfuehren(a, b);
    }
}
