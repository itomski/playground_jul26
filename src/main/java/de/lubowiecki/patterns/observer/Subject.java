package de.lubowiecki.patterns.observer;

// wird beobachtet
public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
