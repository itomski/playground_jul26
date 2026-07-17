package de.lubowiecki.aufgaben.loesungen.a13;

import java.util.Random;
import java.util.Scanner;

public class SpielNext {

    private static final int REIHEN = 5;
    private static final int ZELLEN = 7;

    private static final int ANZAHL_PILZE = 3;
    private static final int ANZAHL_VERSUCHE = 5;

    // TODO: Spielfeld
    private final static char[][] spielfeld = new char[REIHEN][ZELLEN];

    private final static Random rand = new Random();

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Pilze verteilen
        verteilePilze();

        // Pilze suchen
        int pilzeGefunden = suchePilze();

        System.out.println("ENDE!");
        System.out.println("Du hast " + pilzeGefunden + " Pilze gefunden \n");

        // Ausgabe
        printSpielfeld();
    }

    private static int suchePilze() {
        int pilzeGefunden = 0;

        for (int i = 0; i < ANZAHL_VERSUCHE; i++) {
            // TODO: Validierung der Eingaben
            System.out.println("Wo soll ich suchen?");
            System.out.print("x: ");
            int x = scanner.nextInt();
            System.out.print("y: ");
            int y = scanner.nextInt();
            if(spielfeld[x][y] == 'T') {
                System.out.println("GEFUNDEN!!!!!!");
                pilzeGefunden++;
            }
            else {
                System.out.println("LEIDER NICHT GEFUNDEN!!!!!!");
            }
        }
        return pilzeGefunden;
    }

    private static void verteilePilze() {
        for(int i = 0; i < ANZAHL_PILZE; i++) {
            pilzSetzen();
        }
    }

    private static void pilzSetzen() {
        int x = rand.nextInt(REIHEN);
        int y = rand.nextInt(ZELLEN);
        if(spielfeld[x][y] == 'T') {
            pilzSetzen(); // Wenn belegt, Pilz an eine andere Position setzen
        }
        else {
            spielfeld[x][y] = 'T';
        }
    }

    private static void printSpielfeld() {
        for (char[] row : spielfeld) {
            for (char colomn : row) {
                if(colomn == 'T')
                    System.out.print("\uD83C\uDF44 ");
                else
                    System.out.print(colomn + "  ");
            }
            System.out.println();
        }
    }
}
