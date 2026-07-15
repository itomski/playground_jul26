package de.lubowiecki.oop;

public class ProduktTest {

    public static void main(String[] args) {

        Produkt p1 = new Produkt();
        Produkt p2 = new Produkt();

        p1.name = "Tasse, rot";
        p2.name = "Tasse, grün";

        // Klassenvariablen und Klassenmethoden können DIREKT auf der Klasse aufgerufen werden
        System.out.println(Produkt.count); // Auslesen der statischen Eigenschaft (Klassenvariable)

        // Für Aufruf von Instanz-Variablen und Instanz-Methoden wird eine Instanz (Objekt) benötigt
        System.out.println(p1.serienNr); // Auslesen der Instanz-Eigenschaft (Instanzvariable)

    }

}
