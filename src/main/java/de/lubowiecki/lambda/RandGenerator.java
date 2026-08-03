package de.lubowiecki.lambda;

public class RandGenerator {

    public static void main(String[] args) {

        // Implementierungen = Lambdas
        // int roll();
        final Dice W6 = () -> (int)(Math.random() * 6) + 1; // Definition: Implementierung der abstrakten roll-Methode
        final Dice W10 = () -> (int)(Math.random() * 10) + 1;
        final Dice W20 = () -> (int)(Math.random() * 20) + 1;

        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W10.roll());
        System.out.println(W20.roll());

    }
}

interface Dice {
    int roll();
}
