package de.lubowiecki.basics;

public class Kontrollstrukturen3 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // i ist out of scope = variablenname ist nicht mehr reserviert

        System.out.println();

        int i = 0;
        for (; i < 10;) {
            System.out.println(i++);
        }

        System.out.println();
        System.out.println(i); // Variable ist immer noch reserviert

        System.out.println();

        for (i = -10; i < 10; System.out.println(i++)); // Kein Block, dafür aber Ausgabe im letzten Bereich

        System.out.println();

        String[] namen = {"Peter", "Bruce", "Carol", "Natasha", "Steve", "Scott"};
        for (int j = 0; j < namen.length; j++) {
            System.out.println(namen[j]);
        }

        System.out.println();

        for (String name : namen) {
            System.out.println(name);
        }
    }
}
