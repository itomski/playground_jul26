package de.lubowiecki.tutorials.tab2b;

public class Konto {

    private int kontoNr;

    public int getKontoNr() {
        return kontoNr;
    }
                        // int kontoNr = 123456789
    public void setKontoNr(int kontoNr) {
        // this = dieses Objekt
        // kontoNr = Lokale Variable: wird am Ende der Methode gelöscht
        // this.kontoNr = Instanzvariable: Bleibt so lange bestehen, wie das Objekt verfügbar ist
        this.kontoNr = kontoNr;
    }
}
