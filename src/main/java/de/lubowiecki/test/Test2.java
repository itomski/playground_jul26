package de.lubowiecki.test;

public class Test2 {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];
        arr[0] = new int[3];
        //arr[2] = {1,2,3}; // Error: Schreibweise nur bei gleichzeitiger Deklaration erlaubt
        arr[2] = new int[]{1,2,3}; // OK
        /*
        {
            {0,0,0},
            {0,0},
            {0,0}
        }
        */

        int [][] ints = new int[2][]; // {null, null}

//        int x = 10, y = 12;
//        System.out.println("Answer is: " + x + y); // Verkettung
//        System.out.println("Answer is: " + x * y); // Multi und dann Verkettung
        // System.out.println("Answer is: " + x - y); // Error

        // WENN ? DANN : SONST
        // WENN ? DANN : (WENN ? DANN: SONST)

        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(z / y + z * 2);

        // Referenztyp: Object
        // Objekttyp: String
        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        // Attribute und statische Methoden werden auf dem Referenztyp ausgeführt
        Object o = new String("Moin");
    }
}
