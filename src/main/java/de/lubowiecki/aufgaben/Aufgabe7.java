package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe7 {

    // Schreibe eine Klasse Rechner mit den 4 Grund-Rechenarten als Methoden
    // Schreibe eine main-Methode wo du alle 4 Methoden durchtestest

    // Erweiterung
    // Verwende einen Scanner und eine Eingabe des Users einzulesen und an den Rechner wieterzugeben

    public static void main(String[] args) {

        double erg = add(10, 15.2);
        System.out.println(erg);

        // 10 promoviert automatisch zu 10.0 (als double) - primitive widening
        System.out.println(Aufgabe7.add(10, 15.2));
        System.out.println(sub(10, 15.2));
        System.out.println(multi(10, 15.2));
        System.out.println(div(10, 15.2));

        // byte < short < int < long < float < double

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();
        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.println();
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(Aufgabe7.multi(a, b));
        System.out.println(div(a, b));

    }

    public static double add(double a, double b) {
        double erg = a + b;
        return erg;
    }

    public static double sub(double a, double b) {
        double erg = a - b;
        return erg;
    }

    public static double multi(double a, double b) {
        double erg = a * b;
        return erg;
    }

    public static double div(double a, double b) {
        double erg = a / b;

        if(Double.isInfinite(erg))
            throw new IllegalArgumentException("0 ist nicht erlaubt");

        return erg;
    }
}
