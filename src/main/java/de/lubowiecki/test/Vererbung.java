package de.lubowiecki.test;

public class Vererbung {

    public static void main(String[] args) {

        Object o = 123; // Integer liegt auf dem Heap
        System.out.println(o.getClass().getName());
        System.out.println(o instanceof Number);

        System.out.println(); // Leerzeile
        // System.out.print(); // Kompilererror

        Number n = 123; // Integer
        Integer i = (Integer)n;
        Double d = (Double)n; // ClassCastException

    }
}
