package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] zahlen = {3,7,9,22,-5,18,100}; // Nur bei gleichzeitiger Deklaration der Variable möglich
        // zahlen = {3,7,9}; // Error
        zahlen = new int[]{22, 9, 3, 7, 18}; // Ok

        System.out.println(zahlen);
        System.out.println(zahlen.length);

        // Utility Klasse: Können nicht instanziert werden. Haben NUR statische Methoden und Konstanten

        System.out.println(Arrays.toString(zahlen));
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen));

        // Das Array muss vor binarySearch sortiert sein
        System.out.println(Arrays.binarySearch(zahlen, 7));
        System.out.println(Arrays.binarySearch(zahlen, 19));

        System.out.println();

        System.out.println(Arrays.toString(zahlen));
        zahlen = Arrays.copyOf(zahlen, 10);
        System.out.println(Arrays.toString(zahlen));

        System.out.println();

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.round(17.968));
        System.out.println(Math.floor(17.968));
        System.out.println(Math.pow(2,5));

    }
}
