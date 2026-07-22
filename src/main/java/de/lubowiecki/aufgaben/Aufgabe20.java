package de.lubowiecki.aufgaben;

public class Aufgabe20 {

    /*

    Frage von der Console einen Zahlenwert ab.
    Wenn die Zahl ungültig ist oder unter 0... oder höher als 100, frage sie noch mal ab.
    Abfrage soll erfolgen, bis ein gültiger Wert eingegeben wurde

    */

    public static void main(String[] args) {

//        int i;
//        while(true) {
//            try {
//                i = 10; // Einlesen und zuweisen
//                break; // Wenn OK
//            }
//            catch(Exception e){
//                System.out.println("Ungültig");
//            }
//        }
//        System.out.println(i);

        System.out.println(machWas());
        try {
            try {
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (RuntimeException e) {
                System.out.println("RuntimeException");
                throw e; // rethrow
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        catch (RuntimeException e) {
            // hier kann der rethrow gefangen werden
        }
    }

    static int machWas() {
        try {
            //return 10;
            throw  new RuntimeException("Problem 1");
        }
        finally {
            return 20; // Überschreibt die Rückgabe/Exception
            //...
            // throw  new RuntimeException("Problem 2");
        }
    }
}
