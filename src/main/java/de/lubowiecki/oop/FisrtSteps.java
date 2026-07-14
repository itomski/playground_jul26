package de.lubowiecki.oop;

public class FisrtSteps {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB234", "Renault", "Scenic", 2015); // new istanziert ein neues Objekt aus der Klasse
        System.out.println(f1);

        // Objekt mit Werten belegen
//        f1.marke = "Renault";
//        f1.modell = "Scenic";
//        f1.kennzeichen = "HH:AB234";
//        f1.baujahr = 2015;

        // Werte auslesen
        System.out.println(f1.marke);
        System.out.println(f1.modell);
        System.out.println(f1.kennzeichen);
        System.out.println(f1.baujahr);

        // Objekt mit Vorbelegung
        Fahrzeug f2 = new Fahrzeug("B:XYZ567", "VW", "Polo", 2019);

        Fahrzeug f3 = new Fahrzeug(); // Leeres Objekt
//        Fahrzeug f4 = new Fahrzeug();
//        Fahrzeug f5 = new Fahrzeug();

        System.out.println();

        String[] f6 = new String[4];
        f6[0] = "Peugeot";
        f6[1] = "206";
        f6[2] = "B:XY345";
        f6[3] = "2020";
        System.out.println(f6[0]);

    }
}
