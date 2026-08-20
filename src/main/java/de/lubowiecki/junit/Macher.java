package de.lubowiecki.junit;

import java.util.Random;

public class Macher {

    private Random random = new Random();

    /**
     * Liefert eiene Zufallszahl zwischen 0 und 100
     * @return
     */
    public int machWas() {
        return random.nextInt(100);
    }

    /**
     * Liefert die Summe aus a und b
     * @param a
     * @param b
     * @return
     */
    public int machWas(int a, int b) {
        return a + b;
    }

    /**
     * Teilt a durch b
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public static double machWasAnderes(double a, double b) throws ArithmeticException {
        double res = a / b;
        if(Double.isInfinite(res)) {
            throw new ArithmeticException();
        }
        return res;
    }
}
