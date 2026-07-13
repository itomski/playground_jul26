package de.lubowiecki;

public class Start {

//    // Klassenvariable
//    static boolean b6;
//    // Instanzvariable
//    boolean b7;
//
    // Einstieg in Programm
    public static void main(String[] args) {

        // sout
        // System.out.println = Ausgabe auf der Konsole
        System.out.println("Moin Moin");

        // Deklaration und Initialisierung einer Variable
        boolean b1 = true;

        boolean b2; // Deklaration
        b2 = false; // Initialisierung: Zuweisung eines Startwertes
        b2 = true; // Wertänderung

        var b3 = true; // Kompiler ermittelt den Typ
        // b3 = 100; // Variable ist vom Typ boolean

        boolean b4; // Lokale Variablen bekommen keinen Standardwert
        b4 = true;
        System.out.println(b4);

        System.out.println("Dein Wert ist: " + b4); // + = Verkettung

        // Ganzzahlen

        byte b7 = -120;
        byte bb1 = 10;
        byte bb2 = 20;
        //byte bb3 = bb1 + bb2; // Bei mathematischen Operationen promoviert byte mind. zu int

        // byte < short < int < long < float < double
        //         char <

        short s1 = 32000; // Muss im Wertebereich von short liegen
        // short s2 = 35000; // Error
        // Bei mathematischen Operationen promoviert short mind. zu int

        int i1 = 10;
        int i2 = 10000;
        // ist Standard für Ganzzahlen

        int anzahlPersonen = 100;
        int mindAlter = 20;

        long l1 = 100; // int promoviert zu long
        long l2 = 100L; // long
        long l3 = 10_000_000L; // _ Verändern nicht die Bedeutung / verbessern ggfl. die Lesbarkeit
        System.out.println(l3);

        float f1 = 10.5f; // Float MUSS ein f oder F mitführen

        // Kleinere Typen können automtisch in größere konvertiert werden
        // Größere in kleinere nur mit einem Cast

        int i5 = (int)10.7; // Cast: Konvertierung wird erzwungen

        f1 = .5f; // 0.5f
        f1 = 1f; // 1.0f

    } // Ende des Programms
}
