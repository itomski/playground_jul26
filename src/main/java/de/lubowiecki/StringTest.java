package de.lubowiecki;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        String s = "Das ist das \"Haus\" von Nikigraus! c:\\user\\";
        int i = 100;
        System.out.println(s);
        s = "Das ist das \n\tHaus von Nikigraus!";
        System.out.println(s);
        System.out.println("\uD83C\uDF44");

        // String ist in Java KEIN primitiver Datentyp

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dein Text: ");
        String eingabe = scanner.nextLine(); // Liest Eingabe bis zum Enter
        System.out.println(eingabe);

        System.out.println();

        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        //String zahl3 = scanner.next(); // Liest eine Zeichenkette bis zum ersten Leerzeichen ein

        // Ist einer der Operanden ein String, verkettet + bei zu einem String
        System.out.println("Summe = " + (zahl1 + zahl2));

    }
}
