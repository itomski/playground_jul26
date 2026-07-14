package de.lubowiecki.basics;

public class Kontrollstrukturen {

    public static void main(String[] args) {

        int i = 10;
        int j = 10;

        if(i < j) { // Wenn true
            // Dann
            System.out.println("A");
        }

        System.out.println();

        if(i < j) { // Wenn true
            // Dann
            System.out.println("A");
        }
        else {
            // Sonst
            System.out.println("B");
        }

        System.out.println();

        if(i < j)
            System.out.println("A"); // Nur diese Anweisung gehört zum if
            System.out.println("AA");
//        else // Error - else gehört nicht mehr zum if
//            System.out.println("B");


        if(i < j);
            System.out.println("A"); // Gehört nicht mehr zum if

        System.out.println();

        // Die Fälle schlißen sich gegenseitig aus
        if(i < 5) {
            System.out.println("sehr klein");
        }
        else if(i < 10) {
            System.out.println("klein");
        }
        else if(i < 20) {
            System.out.println("mittel");
        }
        else if(i < 50) {
            System.out.println("groß");
        }
        else {
            System.out.println("zu groß!");
        }

        // Es können mehrere Fälle gkleichzeitig eintreten
//        if(i < 5) {
//            System.out.println("sehr klein");
//        }
//        if(i < 10) {
//            System.out.println("klein");
//        }
//        if(i < 20) {
//            System.out.println("mittel");
//        }
//        if(i < 50) {
//            System.out.println("groß");
//        }


        String text = "";
        int zahl = 5;

        if(zahl < 10)
            text = "ok";
        else
            text = "fehler!";

        System.out.println(text);

                            // WENN    //DANN  // SONST
        System.out.println((zahl < 10) ? "ok" : "fehler!");

        text = (zahl < 10) ? "ok" : "fehler!";
        System.out.println(text);
    }
}
