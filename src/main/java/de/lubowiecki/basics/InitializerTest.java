package de.lubowiecki.basics;

import java.time.LocalTime;

public class InitializerTest {

    private final int zahl; // Bekommt ihren Wert spätestens im Konstruktor

    private static final int andereZahl; // Muss spätestens im statischen Initializer zugewiesen werden

    public static void main(String[] args) {
        InitializerTest it1 = new InitializerTest();
        InitializerTest it2 = new InitializerTest();
        InitializerTest it3 = new InitializerTest();
        System.out.println("MAIN");
    }

    public InitializerTest() {
        // super();
        // <--- Hier werden die Initializer ausgeführt
        System.out.println("C");
    }

    // Werden beim Laden der Klasse einmalig ausgeführt
    static { // static Initializer
        System.out.println("SI1");
    }

    // Werden bei jedem Instanzieren der Klasse ausgeführt
    // Werden direkt vor dem Inhalt des Konstruktors ausgeführt
    { // Instanz-Initializer
        System.out.println("II1");
        zahl = 100;
    }

    static { // static Initializer
        System.out.println("SI2");
        LocalTime lt  = LocalTime.now(); // Lokale Variable
        if(lt.isBefore(LocalTime.NOON)) {
            andereZahl = 200;
        }
        else {
            andereZahl = 500;
        }
    }

    { // Instanz-Initializer
        System.out.println("II2");
    }
}
