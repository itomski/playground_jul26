package de.lubowiecki.aufgaben;

public class Aufgabe1 {

    /*
        Schaue dir die primitiven Datentypen in den KeyNotes an
        und schreibe für jeden Datentyp 2 Variablendeklarationen.
        Beachte bei der Benennung die Namenskonventionen.
        ...
    */

    public static void main(String[] args) {

        boolean istKunde = true;
        boolean altGenug = false;

        int alter = 15;
        altGenug = alter > 17;

        int anzahl = 200;
        byte grad = -20;

        double preis = 7.99;
        System.out.println("Der Preis ist " + preis + " €");

        char zeichen = 'B';

        char anderesZeichen = '\u1C62';
        System.out.println(anderesZeichen);
        anderesZeichen = '\u1F04';
        System.out.println(anderesZeichen);

        System.out.println((char)125);

        System.out.println();

        int wert = 16;
        System.out.println(wert);
        wert = 0b10011; // Binär
        System.out.println(wert);
        wert = 015; // Oktal
        System.out.println(wert);
        wert = 0x25; // Hex
        System.out.println(wert);

        int sum = 5 + 25; // int + int = int

        // Redeklaration: Variablen die in einem bestimmten Kontext verfügbar sind, dürfen nicht neu deklariert werden
        //double sum = 5.5 + 25; // double + int = double // kleinere Typ promoviert zum größeren
        double sum1 = 5.5 + 25;
        sum1 = 5.5 + 25; // Neuzuweisung

    }
}
