package de.lubowiecki.oop;

public class Figur {

    // Instanzvariablen
    String name;
    char x = 'A';
    int y = 1;

    public Figur(String name) {
        this.name = name;
    }

    // Instanzmethoden
    void vorwaerts() {
        x++; // Hier in wirklichkeit this.x++; Ändert das x von "diesem" Objekt
    }

    void rueckwaerts() {
        x--;
    }

    void hoch() {
        y++;
    }

    void runter() {
        y--;
    }
}
