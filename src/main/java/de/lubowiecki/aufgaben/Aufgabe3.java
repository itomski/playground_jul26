package de.lubowiecki.aufgaben;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe3 {

    /*

    Schreibe eine Array von 10 Zufallszahlen und gebe es aus.

     */

    public static void main(String[] args) {

        Random randGen = new Random();

        // System.in = Eingabestrom (Konsole)
        // System.out = Ausgabestrom (Konsole)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl Zufallszahlen? ");
        int anzahl = scanner.nextInt();

        int[] rands = new int[anzahl];
//        rands[0] = randGen.nextInt(1,7);
        // etc.

        System.out.println(Arrays.toString(rands));

        for(int i = 0; i < rands.length; i++) {
            rands[i] = randGen.nextInt(1,7);
        }

        System.out.println(Arrays.toString(rands));
    }
}
