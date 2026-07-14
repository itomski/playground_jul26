package de.lubowiecki.basics;

import java.util.Scanner;

public class Kontrollstrukturen4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String eingabe = "";

        while(!eingabe.equals("EXIT")) { // Solange true
            System.out.println("Hallo 1"); // Dann
            eingabe = scanner.next().trim().toUpperCase();
            if(eingabe.equals("Q")) break; // Bricht die Schleife vorzeitig ab
        }


        System.out.println();

        // Block wird mind. 1 x ausgeführt
        do {
            System.out.println("Hallo 2");
            eingabe = scanner.next().trim().toUpperCase();
        } while(!eingabe.equals("EXIT")); // Ein weiteres mal?

        // Lokale Variablen sind NUR in Blöcken sichtbar, in den sie deklariert sind - und ihren Unterblöcken...
        byte b1 = 20;
        {
            System.out.println(b1); // sichtbar, da Unterblock von main
            byte b2 = 30;
        }
        // System.out.println(b2); // Error: Out of scope - Variable ist hier nicht mehr sichtbar

    }
}
