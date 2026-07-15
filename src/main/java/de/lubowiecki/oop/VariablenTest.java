package de.lubowiecki.oop;

public class VariablenTest {

    // Klassenvariable (static) - gehört der Klasse. Alle Objekte können auf eine und die gleiche Variable zugreifen
    static int zahl = 100;

    // Instanzvariable - gehört einem Objekt. Jedes Objekt hat seine eigene
    int andereZahl = 200;

    public static void main(String[] args) {

        // Lokale Variable - Nur währed des Aufrufs der Methode verfügbar
        int ganzAndereZahl = 300;

    }

}
