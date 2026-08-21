package de.lubowiecki.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {

    private String name;

    private List<Observer> observers = new ArrayList<>();

    private double price;

    private double gap;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    public void addObserver(Observer... observer) {
        for(Observer o : observer)
            addObserver(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void setPrice(double price) {
        gap = price - this.price;
        this.price = price;
        if(gap != 0)
            notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    public double getGap() {
        return gap;
    }
}
