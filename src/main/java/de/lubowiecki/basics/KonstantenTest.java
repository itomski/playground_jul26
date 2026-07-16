package de.lubowiecki.basics;

public class KonstantenTest {

    // Klassenkonstante
    // Muss sofort oder im statischen Initialiser zugewiesen werden;
    private static final int ZAHL = 200;

    // Instanzkonstante
    // Muss spätestens im Konstruktor zugewiesen werden
    private final int ZAHL_2;

    public KonstantenTest() {
        this.ZAHL_2 = 500;
    }

    public static void main(String[] args) {

        //ZAHL = 200; // Wert ist konstanz und kann nicht geändert werden

        KonstantenTest kt = new KonstantenTest();
        System.out.println(kt.ZAHL_2);
        //kt.ZAHL_2 = 300; // Wert ist konstanz und kann nicht geändert werden

        System.out.println(Math.PI);

        // lokale Konstanten
        final String TEXT;
        // Muss vor der ersten Verwendung zugewiesen werden
        TEXT = "Moin Moin";
        // TEXT = "Guten Tag!"; // Neuzuweisung nicht möglich

        System.out.println();

        // Kompiletime-Konstenten
        final double CUSTOM_PI = 3.14;

        // Runtime-Konstante
        final double OTHER_PI;
        OTHER_PI = 3.14159;

        // Beide können nachträglich nicht geändert werden!

        System.out.println(CUSTOM_PI + 10);
        System.out.println(OTHER_PI + 10);

        final int i = 2;
        int j = 2;

        // Eine Variable kann im Case verwendet werden, wenn es eine Kompiletime-Konstante ist
        switch(j) {
            case i -> System.out.println("A");
            case i + 1 -> System.out.println("B");
            case i + 2 -> System.out.println("C");
            case i + 3 -> System.out.println("D");
        }

        System.out.println();

//        while(true) { // Endlosschleife
//        }

//        while(false) { // Error, da Inhalt der Schleife NIE erreicht wird
//            System.out.println("Error");
//        }

        boolean ok = true; // Normale Varaiable oder Runtime-Konstante führt nicht zum Error in der Anweisung nach der Schleife
        while(ok) { // Endlosschleife
        }

        System.out.println("ENDE"); // Error

        if(false) {
            System.out.println("ABC");
        }

        final int K = 100; // Bei primitiven Datentypen darf der Wert nicht geändert werden
        final Buch B = new Buch(); // Bei komplexen Datentypen darf die Referenz nicht geändert werden. Objektzustand schon.

        // String ist IMMUTABLE, Änderung führt zu einem neuen Objekt, dieses darf aber auf die alte Referenz nicht zugewiesen werden
        final String TEXT_2 = "Hallo";
    }
}

class Buch {

}
