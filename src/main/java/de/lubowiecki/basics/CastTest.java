package de.lubowiecki.basics;

public class CastTest {

    public static void main(String[] args) {

        long l1 = 100; // primitive Widening von int auf long
        l1 = 100_000_000_000L;

        int i1 = 'c'; // primitive Widening von char auf int

        char c1 = (char) i1; // int ist zu groß, Cast ist nötig
        System.out.println(c1);

        int i2 = 1000;
        System.out.println((byte)i2); // Überlauf
        i2 = -20_000;
        System.out.println((byte)i2); // Unterlauf

        byte b2 = 100;
        byte b3 = 10;
        // b2 = b2 + b3; // Error: byte, short und char promovieren beim Rechnen mind. zu int
        b2 += b3; // b2 = (byte)(b2 + b3);

        b2 = 125;
        b2++; // b2 = (byte)(b2 + 1);
        b2++;
        b2++;
        System.out.println(b2);

        b2 += 10; // Zusammengesetzte-Operatoren, Increment und Decrement funktionieren nur mit einer Variable

        // Nicht möglich!!!!!!!!!
        // 10++;
        // 17 += 15;

        // Error - Bei Casting von komplexen Datentypen muss eine Verwandschaft bestehen
        //String s = (String)123;
        //Integer i = (Integer)"123";

        int i;
        //System.out.println(i); // Error: Eine lokale Variable muss vor der Verwendung einen Wert bekommen
        // Instanz- und Klassen-Variablen bekommen Defaultwerte

        if(b2 == 7) {
            i = 10;
        }
        // System.out.println(i); // Error: Es muss sichergestellt sein, dass die Variable initialisiert ist!

    }
}
