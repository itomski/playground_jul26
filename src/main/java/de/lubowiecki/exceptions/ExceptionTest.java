package de.lubowiecki.exceptions;

import java.time.LocalDate;

public class ExceptionTest {

    public static void main(String[] args) {

//        System.out.println("MOIN"); // Ausgabestrom NORMAL
//        System.err.println("MOIN"); // Ausgabestrom für Exceptions und Errors

        System.out.println("START");

        // Runtime-Exceptions - unchecked


        String str =  null;
        try {
            System.out.println(str.toUpperCase()); // NullPointerException
            int[] arr = new int[-10]; // NegativeArraySizeException
        }
        catch(Exception e) { // Behandlung der Exception "entschärft" die Exception
            e.printStackTrace(); // Printet den Verlauf der Exception auf dem Stack
            System.out.println(e.getMessage()); // Liefert die Info zu der Exception
            System.out.println(e.getCause()); // Liefert die Ursprungs-Exception
            System.out.println(e); // toString wird aufgerufen
        }

        int[] arr = new int[10];
        // System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

        // String wird zu int geparst
        //int zahl = Integer.parseInt("123a"); // NumberFormatException

        // LocalDate date = LocalDate.of(2020, 2, 30); // DateTimeException


        System.out.println("ENDE");
    }
}
