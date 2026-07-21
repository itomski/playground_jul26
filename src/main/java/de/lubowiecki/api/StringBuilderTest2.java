package de.lubowiecki.api;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ABCDE");

        System.out.println(sb);
        System.out.println(sb.length()); // 5 - Anzahl der Zeichen
        System.out.println(sb.capacity()); // 21 - Bei der Instanzierung: Anzahl der Zeichen + 16

        System.out.println();

        sb.setLength(10); // Wird bis zur geünschter Länge aufgefüllt
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println();

        sb.setLength(100); // Wird bis zur geünschter Länge aufgefüllt - wenn nötig wird die Capacity erhöht
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println();

        sb.setLength(2); // Reduziert nicht die Capacity
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize(); // Capacity auf benötigte Länge reduzieren
        System.out.println(sb.capacity());
    }
}
