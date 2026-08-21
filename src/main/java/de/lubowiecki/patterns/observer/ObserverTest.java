package de.lubowiecki.patterns.observer;

public class ObserverTest {

    public static void main(String[] args) {

        Stock asml = new Stock("ASML", 1510.0);

        Broker b1 = new Broker("Peter", Strategy.CAREFUL);
        Broker b2 = new Broker("Bruce", Strategy.NORMAL);
        Broker b3 = new Broker("Carol", Strategy.RISKY);
        Broker b4 = new Broker("Natasha", Strategy.CAREFUL);

        asml.addObserver(b1, b2, b3, b4);

        asml.setPrice(1525.10);
        System.out.println();

        asml.setPrice(1528.20);
        System.out.println();

        asml.setPrice(1515.10);
        System.out.println();
    }
}
