package de.lubowiecki.api;

public class StringBuilderTest3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16

        System.out.println();

        sb.ensureCapacity(10); // Stelle sicher, dass 10 Zeichen reinpassen
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16

        System.out.println();

        // Beim Bedarf wird die Capacity erhöht
        sb.ensureCapacity(20); // Stelle sicher, dass 20 Zeichen reinpassen
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 34 = 16 * 2 + 2

        System.out.println();

        // Beim Bedarf wird die Capacity erhöht
        sb.ensureCapacity(1000); // Stelle sicher, dass 1000 Zeichen reinpassen
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 1000

    }
}
