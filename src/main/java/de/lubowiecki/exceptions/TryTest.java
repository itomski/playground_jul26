package de.lubowiecki.exceptions;

public class TryTest {

    public static void main(String[] args) {

        try {
            int[] arr = new int[10];
        }
        catch(Exception e) {
            //...
        }

        try {
            int[] arr = new int[10];
        }
        catch(Exception e) {
            //...
        }
        finally {
            //...
        }

        try {
            int[] arr = new int[10];
        }
        finally {
            //...
        }

        // try darf nicht alleine stehen
//        try {
//            int[] arr = new int[10];
//        }

        // Hier kann das try auch alleine stehen
//        try(...) {
//
//        } // schließt automatisch die geöffneten Resourcen

    }

}
