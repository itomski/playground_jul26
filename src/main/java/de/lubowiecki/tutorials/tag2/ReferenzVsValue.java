package de.lubowiecki.tutorials.tag2;

public class ReferenzVsValue {

    public static void main(String[] args) {

        int a = 100;
        int b = a; // Copy: Value
        b++;
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        Box aBox = new Box();
        Box bBox = aBox; // Referenz auf das alte Objekt
        //Box bBox = new Box(); // Neues Objekt
        bBox.zahl++;
        System.out.println(aBox.zahl);
        System.out.println(bBox.zahl);

        System.out.println();
        change(a); // a wurde nicht geändert. Nur die lokale Kopie innerhalb der Methode wurde geändert
        System.out.println(a);
        changeBox(aBox); // aBox wurde geändert, da die lokale Variable b auf das gleiche Objekt zeigt
        System.out.println(aBox.zahl);

    }
                             // int i = a // Copy
    public static void change(int i) {
        i++; // Verändert nur den lokalen Wert i, nicht das Original a
    }
                                // Box b = aBox // Referenz
    public static void changeBox(Box b) {
        // b ist eine neue Referenz zu dem Objekt hinter aBox
        b.zahl++; // Verändert das Original
    }
}

class Box {
    public int zahl = 100;
}
