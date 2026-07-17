package de.lubowiecki.aufgaben.loesungen.a13;

import java.util.Random;
import java.util.Scanner;

public class Spiel {

    /*
    Schreibe ein Programm, dass das Spiel Pilzsuche realisiert.

    Beim Starten des Programms wird ein 10 Zeilen und 10 Zellen großes Spielfeld erzeugt.
    Danach werden automatisch 10 „Pilze“ positioniert. Jeder Pilz wird auf einer x/y-Koordinate platziert.
    Danach hat der Spieler 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe der Koordinaten zu finden.

    Nach 10 Versuchen endet das Spiel und es wird die Anzahl der gefundenen Pilze angezeigt.
    */

    public static void main(String[] args) {

        // TODO: Spielfeld
        char[][] spielfeld = new char[10][10];

        // TODO: Pilze verteilen
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            int x = rand.nextInt(10); // Zahl zwischen 0 und 9
            int y = rand.nextInt(10); // Zahl zwischen 0 und 9
            spielfeld[x][y] = 'T';
        }

        // TODO: Pilze suchen
        Scanner scanner = new Scanner(System.in);

        int pilzeGefunden = 0;

        for (int i = 0; i < 10; i++) {
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

        System.out.println("ENDE!");
        System.out.println("Du hast " + pilzeGefunden + " Pilze gefunden \n");

        // TODO: Ausgabe

        for (char[] row : spielfeld) {
            for (char colomn : row) {
                System.out.print(colomn + " ");
            }
            System.out.println();
        }
    }
}
