package de.lubowiecki.oop;

public class Produkt {

    static int count;

    int serienNr;

    String name;

    double gewicht;

    public Produkt() {
        this.serienNr = ++count;
    }
}
