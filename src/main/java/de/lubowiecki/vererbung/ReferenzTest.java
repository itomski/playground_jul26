package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class ReferenzTest {

    private static int zahl = 100;
    private int andereZahl = 200;

    public static void main(String[] args) {

        Object o = new Object();
        o = "Moin"; // String IS-A Object
        o = 123; // Autoboxing von int auf Integer, Integer IS-A Object

        // Objekte auf dem Heap ändern ihre Idenitität nicht
        if(o instanceof Integer) {
            System.out.println("Ist eine Ganzzahl!");
        }

        Number n = 10.5; // Autoboxing von double auf Double
        n = 10; // Autoboxing von int auf Integer

        List<Number> zahlen = new ArrayList<>();
        zahlen.add(10);
        zahlen.add(100L);
        zahlen.add(7.2);
        zahlen.add(7.5f);

        for(Number nr : zahlen) {
            System.out.println(nr.doubleValue());
        }
    }

    public static void setZahl(int zahl) {
        // ReferenzTest.zahl = Klassenvariable
        // zahl = lokale Variable
        ReferenzTest.zahl = zahl;
    }

    public void setAndereZahl(int andereZahl) {
        // lokale Variablen überlagern gleichnamige Instanz- oder Klassenvariablen
        // this.andereZahl = Instanzvariable
        // andereZahl = lokale Variable
        this.andereZahl = andereZahl;
    }
}
