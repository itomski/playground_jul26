package de.lubowiecki.oop;

public class MethodenTest {

    public static void main(String[] args) {

        String s = "Das ist ein Haus von Nikigraus";
        s = textAendern(s);
        System.out.println(s);

        s = textAendern("bla bla bla bla");
        System.out.println(s);

        s = textErweitern("Moin Moin", "Welt!");
        System.out.println(s);

        // Anzahl der Parameter ist NICHT variabel
//        s = textErweitern("Moin Moin"); // Kompilererror
//        s = textErweitern("Moin Moin", "...", "xyz"); // Kompilererror

    }

    // Klassenmethode (static)
    static String textAendern(String text) {
        return text.toUpperCase();
    }

    // Klassenmethode (static)
    static String textErweitern(String text, String erweiterung) {
        return text + " " + erweiterung;
    }
}
