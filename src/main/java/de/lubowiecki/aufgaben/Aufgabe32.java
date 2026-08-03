package de.lubowiecki.aufgaben;

public class Aufgabe32 {

    /*
    Schreibe für jedes der nachfolgenden FunctionalInterfaces 3 Implementierungen
    Teste sie
    */

}

@FunctionalInterface
interface Rechner {
    double ausfuehren(double x, double y);
}

@FunctionalInterface
interface Printer {
    void print(String content);
}

@FunctionalInterface
interface Manipulator {
    String change(String content);
}
