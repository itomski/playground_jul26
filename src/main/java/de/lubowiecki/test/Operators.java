package de.lubowiecki.test;

public class Operators {

    public static void main(String[] args) {

        xyz: while(true) {

            int eingabe = 3;

            switch(eingabe) {
                case 1:
                    System.out.println("A");
                    break;

                case 2:
                    System.out.println("B");
                    break;

                case 3:
                    System.out.println("C");
                    break; // bricht switch ab

                case 4:
                    continue; // nächster durchlauf der while-schleife

                case 0:
                    break xyz; // bricht die while-shileife ab
            }
        }

        byte b = 120;

        switch(b) {
            case 100:
            case 120:
            // case 130: // Error
        }

        long l = 10_000_000_000L;


    }
}
