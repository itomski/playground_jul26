package de.lubowiecki.patterns.observer;

public class Broker implements Observer {

    private String name;

    private Strategy strategy;

    public Broker(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    @Override
    public void update(Subject obj) {

        Stock stock = (Stock)obj;

        if(stock.getGap() > 0) {
            switch(strategy) {
                case RISKY -> System.out.println("Broker: " + this.name + " kauft nach");
                case NORMAL -> System.out.println("Broker: " + this.name + " beobachtet");
                case CAREFUL -> System.out.println("Broker: " + this.name + " realisiert den Gewinn");
            }
        }
        else {
            switch(strategy) {
                case RISKY -> System.out.println("Broker: " + this.name + " kauft den Dip");
                case NORMAL -> System.out.println("Broker: " + this.name + " beobachtet weiter");
                case CAREFUL -> {
                    System.out.println("Broker: " + this.name + " verkauft");
                    // obj.removeObserver(this);
                }
            }
        }
    }
}
