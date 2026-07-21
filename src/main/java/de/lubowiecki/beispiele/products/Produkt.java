package de.lubowiecki.beispiele.products;

public class Produkt {

    private String name;
    private String beschreibung;
    private int anzahl;
    private double preis;

    public Produkt(String name, String beschreibung, int anzahl, double preis) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public double getPreis() {
        return preis;
    }
}
