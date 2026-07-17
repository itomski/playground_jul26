package de.lubowiecki.aufgaben;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe13 {

    /*
    Schreibe ein Programm, dass das Spiel Pilzsuche realisiert.

    Beim Starten des Programms wird ein 10 Zeilen und 10 Zellen großes Spielfeld erzeugt.
    Danach werden automatisch 10 „Pilze“ positioniert. Jeder Pilz wird auf einer x/y-Koordinate platziert.
    Danach hat der Spieler 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe der Koordinaten zu finden.

    Nach 10 Versuchen endet das Spiel und es wird die Anzahl der gefundenen Pilze angezeigt.

    Erweiterung
    Der Spieler wird gefragt, ob er noch ein weiteres Mal spielen möchte.
     */

    private static final Random RAND = new Random();

    private static final int[][] SPIELFELD = new int[10][10];

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final int MAX_VERSUCHE = 10;

    private static final int ANZAHL_PILZE = 10;

    private static int gefunden = 0;

    public static void main(String[] args) {

        System.out.println("Pilzsuche!");

        pilzeVerteilen();

        for(int i = 0; i < MAX_VERSUCHE; i++) {
            System.out.println("Wo soll ich suchen?");
            pilzSuchen();
        }

        System.out.println("Ende!");
        System.out.println("Du hast " + gefunden + " Pilze gefunden.");

        printSpielfeld();
    }

    private static void printSpielfeld() {

        for(int[] reihe : SPIELFELD){
            System.out.print("|");
            for(int zelle : reihe){
                String output = switch(zelle) {
                    case 1 -> "\uD83C\uDF44 ";
                    default -> "   ";
                };
                System.out.print(output);
            }
            System.out.print("| \n");
        }
    }

    private static void pilzeVerteilen() {

        // TODO: Falls die Stelle belegt ist, eine andere Stelle wählen

        for (int i = 0; i < ANZAHL_PILZE; i++) {
            int x = RAND.nextInt(0, 10);
            int y = RAND.nextInt(0, 10);
            SPIELFELD[x][y] = 1;
        }
    }

    private static void pilzSuchen() {

        // TODO: Validierung

        System.out.print("x: ");
        int x = SCANNER.nextInt();
        System.out.print("y: ");
        int y = SCANNER.nextInt();

        if(SPIELFELD[x][y] == 1) {
            System.out.println("Gefunden!");
            gefunden++;
        }
        else {
            System.out.println("Sorry. Hier ist kein Pilz!");
        }
    }
}
