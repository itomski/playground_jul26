package de.lubowiecki.oop;

// Eine Klasse ist der Bauplan für verschiedene Fahrzeuge
public class Fahrzeug {

    // Instanzvariable
    String kennzeichen;
    String marke;
    String modell;
    int baujahr;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }
}
