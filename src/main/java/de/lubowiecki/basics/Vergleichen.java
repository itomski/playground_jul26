package de.lubowiecki.basics;

import java.util.Scanner;

public class Vergleichen {

    public static void main(String[] args) {

        int i = 10; // = Zuweisung
        int j = 20;
        double k = 15.2;

        System.out.println(i == j); // == Vergleich
        System.out.println(i != j);

        // Bei Vergleichen von primitiven Datentypen
        // Beide Operanden müssen den gleichen Typ haben. Der kleinere promoviert zu dem größeren
        System.out.println(i == k);

        System.out.println();

        // Stringvergleich
        String a = "Hallo";
        String b = "Hallo";
        String c = new String("Hallo");

        // Strings sind komplex
        // Bei komplexen Datentypen vergleicht == ob es das gleiche Objekt auf dem Heap ist
        // equals vergleicht den Inhalt
        System.out.println(a == b); // Liegt im String-Literal-Pool
        System.out.println(a == c);
        System.out.println(a.equals(c));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe: ");
        String einngabe = scanner.next();

        System.out.println("Deine Eingabe ist \"exit\": " + einngabe.equals("exit"));
    }
}
