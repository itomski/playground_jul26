package de.lubowiecki.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

    public static void main(String[] args) {

        // Nicht sortiert!
        // Aber geordnet - Einfügereihenfolge
        List<String> personen = new ArrayList<>();
        personen.add("Peter");
        personen.add("Bruce");
        personen.add("Scott");
        personen.add("Natasha");
        personen.add("Carol");
        personen.add("Steve");
        personen.add("Toni");

        System.out.println(personen); // Unsortiert
        Collections.sort(personen);
        System.out.println(personen); // Sortiert
        personen.add("Bob");
        System.out.println(personen); // Unsortiert

        int erg = Collections.binarySearch(personen, "Scott");
        System.out.println(erg);

        System.out.println();

        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Zange"));
        things.add(new Thing("Tasse"));
        things.add(new Thing("Tisch"));

        // Things sind derzeit NICHT vergleichbar
        // Für eigene Klassen muss die Sotierbarkeit extra implementiert werden
        // Collections.sort(things);

        Thing t1 = new Thing("Hammer");
        Thing t2 = new Thing("Hammer");
        System.out.println(t1 == t2); // gleiches Objekt?

        // Things sind derzeit nicht vergleichbar
        // Für eigene Klassen muss die Vergleichbarkeit extra implementiert werden
        System.out.println(t1.equals(t2)); // gleicher Inhalt?

    }
}

class Thing {

    String name;

    public Thing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
