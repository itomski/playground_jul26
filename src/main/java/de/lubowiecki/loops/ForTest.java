package de.lubowiecki.loops;

public class ForTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //...
        }

        int i = 0;
        for (; i < 10; i++) {
            //...
        }

        for (; i < 10;) {
            //...
            i++;
        }

//        for (;;) { // Endlosschleife
//        }

        for (int j = 0, x = 20; ; System.out.println(j), j++);
    }
}
