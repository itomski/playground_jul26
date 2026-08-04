package de.lubowiecki.oop;

import de.lubowiecki.aufgaben.loesungen.a6.Rechner;

public class DefaultMethoden {
}

class NextInterClass implements Inter1, Inter2 {

    @Override
    public void machWas() {
        System.out.println("machWas");
    }

    @Override
    public void machWasGansAnderes() {
        System.out.println("machWasGansAnderes");
    }

    @Override
    public void machWasAnderes() {
        System.out.println("machWasAnderes Class");
    }
}

interface Inter1 {

    // Alle Attribute im Interface sind automatisch public static final - Werden vererbt
    // Alle Methoden sind public

    // Methoden können statisch sein - Sie werden nicht weitervererbt

    // Instanzmethoden sind abstract oder default

    void machWas(); // abstract

    // Default Methoden gibt es NUR in Interfaces
    default void machWasAnderes() {
        // Standardimplementierung für den Fall, dass die Methode nicht implementiert wird
        System.out.println("machWasAnderes Inter1");
    }
}

interface Inter2 {

    void machWas();

    void machWasGansAnderes();

    default void machWasAnderes() {
        System.out.println("machWasAnderes Inter2");
    }
}