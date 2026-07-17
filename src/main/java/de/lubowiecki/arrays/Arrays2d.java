package de.lubowiecki.arrays;

public class Arrays2d {

    public static void main(String[] args) {

        // Array-Index ist IMMER vom Typ int
        int[][] zahlenMatrix = {
            {1,2,3},
            {10,20,30},
            {100, 200, 300}
        };

        System.out.println(zahlenMatrix[1][2]);

        for(int i = 0; i < zahlenMatrix.length; i++) {
            for (int j = 0; j < zahlenMatrix[i].length; j++) {
                System.out.print(zahlenMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] reihe : zahlenMatrix) {
            for (int sitz : reihe) {
                System.out.print(sitz + " ");
            }
            System.out.println();
        }

        zahlenMatrix = new int[][]{
                {1,2,3,4,5,6},
                {10,20,30},
                {100}
        };

        System.out.println();

        for(int[] reihe : zahlenMatrix) {
            for (int sitz : reihe) {
                System.out.print(sitz + " ");
            }
            System.out.println();
        }


        char[][] zeichenMatrix = new char[10][10];

        zeichenMatrix[5][5] = '@';

        for(char[] reihe : zeichenMatrix) {
            for (char sitz : reihe) {
                System.out.print(sitz + " ");
            }
            System.out.println();
        }
    }
}
