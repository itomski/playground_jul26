package de.lubowiecki.aufgaben;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe8 {

    /*
    Schreibe ein Programm für einen Würfelbecher
    Eine Klasse Wuerfelbecher und eine Klasse mit einer Main-Methode zum Testen.

    Der Würfelbecher hat eine roll-Methode die einen Zufallswert liefert.
    Der Zufallswert liegt zwischen 1 und 6.

    Zusätzlich soll es eine Methode geben, die als Parameter eine Anzahl bekommt und ein Array mit
    entsprechender Anzahl Zufallszahlen liefert.

    Erweiterung:
    Entwerfe eine zweite Version des Würfelbechers mit neuen Features.
    Der Zufallswert liegt zwischen 1 und max. Augenanzahl.

    Der Würfelbecher kann bei der Instanzierung einen Wert bekommen, der die maximale Anzahl der Augen
    für die Zufallswürfe definiert.

    Bespiele:

    Würfelbecher cup1 = new Würfelbecher(20);
    cup1.roll(); // Liefert einen Wert zwischen 1 und 20

    Würfelbecher cup2 = new Würfelbecher(100);
    cup2.roll(); // Liefert einen Wert zwischen 1 und 100

     */

    public static void main(String[] args) {
        System.out.println(DiceCup.roll());
        System.out.println(DiceCup.roll());
        System.out.println(DiceCup.roll());

        System.out.println(Arrays.toString(DiceCup.roll(10)));
        System.out.println(Arrays.toString(DiceCup.roll(20)));
        System.out.println(Arrays.toString(DiceCup.roll(3)));
    }

}

class DiceCup {

    private static Random rand = new Random();

    public static int roll() {
        return rand.nextInt(1, 7);
    }

    public static int[] roll(int nr) {
        int[] arr = new int[nr];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = roll();
        }
        return arr;
    }
}
