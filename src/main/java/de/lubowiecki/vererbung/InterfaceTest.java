package de.lubowiecki.vererbung;

import java.io.IOException;

public class InterfaceTest {

    public static void main(String[] args) {

        // Fahrbar f1 = new Fahrbar(); // Error! Interface kann NICHT direkt instanziert werden
        Fahrbar f1 = new Pkw();
        f1.links();
        f1.vorwaerts();
        f1.vorwaerts();
        f1.rechts();
        f1.rueckwaerts();
    }
}


interface Fahrbar {

    // in einem Interface sind alle Methoden per default public
    // und alle Methoden per default abstract
    // Ausnahme sind statische und default Methoden

    public void vorwaerts();

    // Methode ist public
    void rueckwaerts();

    void rechts();

    void links();
}

class Pkw implements Fahrbar {

    @Override
    public void vorwaerts() {
        System.out.println("Pkw vorwaerts");
    }

    @Override
    public void rueckwaerts() {
        System.out.println("Pkw rueckwaerts");
    }

    @Override
    public void rechts() {
        System.out.println("Pkw rechts");
    }

    @Override
    public void links() {
        System.out.println("Pkw links");
    }
}
