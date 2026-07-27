package de.lubowiecki.exceptions;

public class UncheckedTest1 {

    public static void main(String[] args) {
        System.out.println("START: main");
        try {
            methodA();
        } catch (RuntimeException e) {
            System.out.println("ENDE: main");
        }
    }

    private static void methodA() {
        System.out.println("START: A");
        methodB();
        System.out.println("ENDE: A");
    }

    private static void methodB() {
        System.out.println("START: B");
//        try {
            methodC();
//        } catch (RuntimeException e) {
//            System.out.println("Exception in B");
//        }
        System.out.println("ENDE: B");
    }

    private static void methodC() {
        System.out.println("START: C");

        // UncheckedException:
        // Wenn eine Exception behandelt wird, kann die Methode nach dem catch fortgesetzt werden
        // Wenn nicht, dann bricht die Methode ab. Exception wird automatisch an den Aufrufer weitergereicht
//        try {
            String s = null;
            System.out.println(s.toUpperCase()); // NullPointerException
//        }
//        catch (RuntimeException e) {
//            System.out.println("Exception in C");
//        }
        System.out.println("ENDE: C");
    }
}
