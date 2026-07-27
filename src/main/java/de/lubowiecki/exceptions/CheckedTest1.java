package de.lubowiecki.exceptions;

public class CheckedTest1 {

    public static void main(String[] args) {
        System.out.println("START: main");
        try {
            methodA();
        }
        catch(Exception e) {
            System.out.println("Exception in main");
        }
        System.out.println("ENDE: main");
    }

    private static void methodA() throws Exception {
        System.out.println("START: A");
        methodB();
        System.out.println("ENDE: A");
    }

    private static void methodB() throws Exception {
        System.out.println("START: B");
        methodC();
        System.out.println("ENDE: B");
    }

    private static void methodC() throws Exception {
        System.out.println("START: C");
        // CheckedException:
        // Wenn eine Exception behandelt wird, kann die Methode nach dem catch fortgesetzt werden
        // Wenn nicht, dann muss die Exception an den Aufrufer weitergereicht werden!
//        try {
            throw new Exception("Problem");
//        } catch (Exception e) {
//            System.out.println("Exception in C");
//        }
//        System.out.println("ENDE: C");
    }
}

