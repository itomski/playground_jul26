package de.lubowiecki.beispiele.products;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Milch, 1,5% Fett..., 100, 1.29

        // Keine gute Wahl!
        String[] p1 = {"Milch", "1,5% Fett...", "100", "1.29"};
        System.out.println(p1[3]);

        // Bessere Wahl
        Produkt p2 = new Produkt("Milch", "1,5% Fett...", 100, 1.29);
        System.out.println(p2.getPreis());

        System.out.println();

        List<Produkt> produkte = new ArrayList<>(); // Sammlung von Produkten
        produkte.add(p2);
        produkte.add(new Produkt("Butter", "Ganz toll", 50, 1.99));
        produkte.add(new Produkt("Käse", "Butterkäse", 10, 2.35));

        // Auf jede Information des Produkts kann einzeln zugegriffen werden

        for (Produkt p : produkte) {
            System.out.println(p.getName() + " (" + p.getBeschreibung() + ")");
        }
    }
}
