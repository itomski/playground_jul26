package de.lubowiecki.basics;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" Welt").append("...");

        System.out.println(sb); // toString wird automatisch ausgeführt
        String s = sb.toString(); // StringBuilder wird mit toString in einen String konvertiert

        int alter = 32;

        String str = new StringBuilder("Mein Name ist")
                                .append(' ')
                                .append("Peter")
                                .append(' ')
                                .append("Parker, ")
                                .append(alter)
                                .append(" Jahre alt")
                                .toString();

        System.out.println();

        StringBuilder sb2 = new StringBuilder();
        sb2.append("1234567890");
        System.out.println(sb2.length()); // Anzahl der Zeichen
        System.out.println(sb2.capacity()); // Größe des internen Arrays
        sb2.append("1234567890");
        // Capacity Anpassung = alte Capacity * 2 + 2
        System.out.println(sb2.length()); // Anzahl der Zeichen
        System.out.println(sb2.capacity()); // Größe des internen Arrays

        System.out.println();

        StringBuilder sb3 = new StringBuilder(100); // Startgröße wird vorgegeben
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        System.out.println();

        StringBuilder sb4 = new StringBuilder("Das ist der Start"); // Startgröße = Anzahl Zeichen + 16
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

        sb4.append("...");
        sb4.trimToSize(); // Schneidet die Capacity auf die benötigte Größe zu
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());
        System.out.println(sb4);

        sb4.replace(0, 10, "..."); // Ersetzt
        sb4.insert(3, "###"); // Einfügen
        System.out.println(sb4);
        sb4.delete(0, 2); // Löschen
        sb4.reverse(); // Umdrehen
        sb4.append(true);
        String s1 = null;
        sb4.append(s1);
        System.out.println(sb4);
    }
}
