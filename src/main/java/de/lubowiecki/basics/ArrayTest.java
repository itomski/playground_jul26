package de.lubowiecki.basics;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {

        int i = 10; // Ein Wert
        i = 15; // Alter Wert wird überschrieben

        // In Java enthalten Array Werte des gleichen Typs
        // Array können ihre Größe nachträglich NICHT ändern
        // Arrays sind Objekte
        int[] sammlung1 = {5, 7, 22, 18, -5, 99};
        System.out.println(sammlung1.length);

        double[] sammlung2 = {2.5, 7.22, 18, 99.2, -5.9};
        System.out.println(sammlung2.length);

        char[] sammlung3 = {};
        System.out.println(sammlung3.length);

        System.out.println();
        System.out.println(sammlung1[2]); // ert am Index 2 wird abgefragt
        System.out.println(sammlung1[0]);
        //System.out.println(sammlung1[-1]); // ArrayIndexOutOfBoundsException
        //System.out.println(sammlung1[10]); // ArrayIndexOutOfBoundsException
        sammlung1[2] = 16; // Wert am Index 2 wird ersetzt

        // Werden komplexe Datentypen ausgegeben, müssen dies zuvor in ein String konvertiert werden
        // Dies erfolgt durch Aufruf der toString Methode
        System.out.println(sammlung1);
        System.out.println(Arrays.toString(sammlung1));

        System.out.println();

        int[] zahlen = new int[10]; // Erzeugt ein Array von 10 Positionen
        zahlen[5] = 100;
        zahlen[2] = 10;
        System.out.println(Arrays.toString(zahlen));

        System.out.println((int)(Math.random() * 6) + 1);
        int rand1 = (int)(Math.random() * 6) + 1;

        Random randGen = new Random();
        System.out.println(randGen.nextInt()); // Zufallszahl im Wertebereich von int
        System.out.println(randGen.nextInt(10)); // Zufallszahl zwischen 0 und 10 (10 exclusive)
        System.out.println(randGen.nextInt(1, 10)); // Zufallszahl zwischen 1 und 10 (10 exclusive)
        int rand2 = randGen.nextInt(1,7);

    }
}
