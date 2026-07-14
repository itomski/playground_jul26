package de.lubowiecki.basics;

public class Immutable {

    public static void main(String[] args) {

        String test = "Hallo";
        test = test + " String";
        System.out.println(test);

        test = test.toUpperCase();
        System.out.println(test);

    }
}
