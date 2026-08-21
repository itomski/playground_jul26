package de.lubowiecki.patterns.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        Rechner add = new Rechner(new AdditionStrategie());
        System.out.println(add.ausfuehren(1.0, 2.0));
        System.out.println(add.ausfuehren(5.75, 2.0));
        System.out.println(add.ausfuehren(9.1, 5.0));

        System.out.println();

        Rechner multi = new Rechner(new MultiplikationStrategie());
        System.out.println(multi.ausfuehren(1.0, 2.0));
        System.out.println(multi.ausfuehren(5.75, 2.0));
        System.out.println(multi.ausfuehren(9.1, 5.0));

    }
}
