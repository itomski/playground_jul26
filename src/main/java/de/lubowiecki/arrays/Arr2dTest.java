package de.lubowiecki.arrays;

public class Arr2dTest {

    public static void main(String[] args) {

        int[][] arr1 =  new int[2][2];
//        {
//            {0,0},
//            {0,0},
//        }

        int[][] arr2 =  new int[2][];
//        {
//            null,
//            null,
//        }

        arr2[0][0] = 1; // NullPointerException
        //arr2[1] = {1,2,3}; // Error
        arr2[1] = new int[]{1,2,3}; // Ok

        int[] arr3 = {3,5,6}; // Nur bei gleichzeitiger Deklaration erlaubt
        arr3 = new int[]{5,7,22,18}; // Bei bereits delarierten Variablen
        arr3 = new int[10]; // Array von Größe 10 mit Standardwerten gefüllt
    }
}
