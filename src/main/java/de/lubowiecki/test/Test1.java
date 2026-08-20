package de.lubowiecki.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList.*; // Klassenimport - Alle innere Klassen von ArrayList werden importiert

public class Test1 {

    static {
        // ExceptionInInitializerError
//        int[] arr = null;
//        System.out.println(arr.length);
    }

    public static void main(String[] args) {

        int[][] arr1 = new int[3][];
        /* {null, null, null} */

        //int[][] arr3 = new int[][3]; // Ungültig
        /* {} */

        try {
            //...
        }
        catch (Exception e) {} // Checked, aber fangen möglich, obwohl im try die Exception nicht entsteht

        try {
            //...
        }
        catch (RuntimeException e) {} // Unchecked, kann immer gefangen werden

//        try {
//            //...
//        }
//        catch (IOException e) {} // Compiler-Error: Andere Checked Exceptions müssen im try entstehen können


        int[] arr3 = new int[0];
        Object o = arr3;
        System.out.println(((int[]) o).length);

        // Compiletime-Konstante
        final int i = 100;

        // Runtime-Konstante
        final int j;
        j = 100;

        // switch kann für cases nur Compiletime-Konstanten verwenden

        int x = 1;
        String[] animal = new String[2];
        animal[0] = "ABC";
        animal[1] = "A";

        if(x == animal[x++].length()) {
            System.out.println("Hi");
        }

        double d1 = .5;
        double d2 = 1d;

        String str = "Hallo";
        //str.concat(" Welt"); // Verändert nicht das Original, sondern produziert ein neues String Objekt
        str = str.concat(" Welt"); // Muss auf eine Referenz zugewiesen werden, sonst geht es verloren
        System.out.println(str);



    }

    public void machWas() throws IOException{ // OK

    }

    public void machWasAnderes() throws IOException { // OK
        throw  new FileNotFoundException("machWasAnderes"); // Kindklasse
    }
}
