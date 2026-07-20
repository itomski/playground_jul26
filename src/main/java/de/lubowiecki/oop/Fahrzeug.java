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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}
