package de.lubowiecki.test;

public class Exceptions {

    public static void main(String[] args) {
//        System.out.println(args[0]);

//        Integer i = 123;
//        String s = (String) i; // Compilererror

        Object o = Integer.valueOf("01001", 2);
        System.out.println(o);
        String s = (String) o; // ClassCastException

    }
}
