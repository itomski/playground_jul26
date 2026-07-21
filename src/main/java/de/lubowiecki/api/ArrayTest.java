package de.lubowiecki.api;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        // Arrays können nachträglich ihre Größe nicht ändern

        int[] array1 = new int[10]; // Arrays von 10 Positionen
        System.out.println(Arrays.toString(array1));
        Arrays.fill(array1, 10); // Füllt jede Position des Arrays mit 10 auf
        System.out.println(Arrays.toString(array1));
        array1[5] = 0;
        System.out.println(Arrays.toString(array1));

        int[] array2 = {1, 2, 3, 4}; // Arrays von 4 Positionen

        int[] array3; // Kein Speicher reserviert

        // Arrays wird bei der Erzeugung mit Standardwerten befüllt

        String[] array4 = new String[3];
        System.out.println(Arrays.toString(array4));

        array4[0] = "ABC"; // OK
        //array4[5] = "ABC"; // ArrayIndexOutOfBoundsException
        //System.out.println(array4[5]); // ArrayIndexOutOfBoundsException

        array4 = new String[-3]; // NegativeArraySizeException

        // array4 = new String[10L]; // Compiler-Error. Nur int erlaubt

        int[][] array5 = new int[3][2];
        array5[1] = new int[]{};
        /*
        {
            0: {0, 0}
            1: {}
            2: {0, 0}
        }
        */

        int[][] array6 = new int[3][]; // Größe der ersten Dimension MUSS angegeben werden
        array6[0] = new int[3];
        array6[1] = new int[]{};
        array6[2] = new int[2];
        /*
        {
            0: {0, 0, 0}
            1: {}
            2: {0, 0}
        }
        */
    }
}
