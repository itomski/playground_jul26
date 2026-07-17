package de.lubowiecki.basics;

public class KonstantenTest2 {

    public static void main(String[] args) {

        final int[] zahlen = new int[10];
        // zahlen = new int[20]; // Änderung der Referenz ist nicht erlaubt
        zahlen[0] = 20;

        final int ZAHL = 100;
        // ZAHL = 20; // Änderung des Wertes ist nicht erlaubt

    }
}
