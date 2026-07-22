package de.lubowiecki.api;

import de.lubowiecki.aufgaben.Aufgabe16;

import java.util.ArrayList;
import java.util.List;

public class SynchroTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();

        synchronized (zahlen) {
            zahlen.add(1);
            zahlen.add(2);
        }
    }
}
