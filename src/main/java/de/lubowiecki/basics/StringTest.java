package de.lubowiecki.basics;

public class StringTest {

    public static void main(String[] args) {

        String text1 = "Hallo String"; // Landet im String-Literal-Pool
        String text2 = text1 + "..."; // Nicht im Pool
        text2 = text2.intern(); // Wird im String-Leteral-Pool abgelegt
        String text3 = "Hallo String..."; // Verweist auf das Objekt im Pool

        System.out.println(text1 == text2);
        System.out.println(text2 == text3); // Prüft Objektgleichheit d.h. zeigen beide Referenzen auf das gleiche Objekt
        System.out.println("1: " + text1);
        System.out.println("2: " + text2);
        System.out.println("3: " + text3);
        System.out.println(text1.equals(text2));
        System.out.println(text2.equals(text3)); // Prüft Inhaltsgleichheit

        String s = "";
        for (int i = 0; i < 100; i++) {
            s += i; // Erzeugt immerwieder neue String Objekte, die nicht im Pool liegen
        }
        System.out.println(s);
    }

}
