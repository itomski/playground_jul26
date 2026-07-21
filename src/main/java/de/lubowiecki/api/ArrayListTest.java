package de.lubowiecki.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        // Unsave Verwendung!!!!
        ArrayList list = new ArrayList(); // Verwendet Object

        // <String> Generischer Typ (austauschbar)
        // Generische Typen sind IMMER komplex
        // primitive Datentypen werden als ihre Wrapper-Typen genutzt
        ArrayList<String> list2 = new ArrayList<>(); // Verwendet String

        ArrayList<Integer> list3 = new ArrayList<>(); // Verwendet Integer

        ArrayList<Double> list4 = new ArrayList<>(); // Verwendet Double

        ArrayList<Person> list5 = new ArrayList<>(); // Verwendet Person

        list2.add("a"); // Ein Element hinzufügen
        list2.add("b");
        list2.add("c");
        System.out.println(list2);
        System.out.println(list2.size()); // Anzahl Elemente
        list2.add("d"); // An nächster freien Stelle hinzufügen
        System.out.println(list2);
        System.out.println(list2.size()); // Anzahl Elemente

        System.out.println();
        for(int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)); // Liest ein Element an gewünschter Position. Position MUSS gültig sein
        }

        System.out.println();
        // Alle Listen in Java haben einen Index. Dieser startet IMMER bei 0
        list2.remove("a"); // An gewünschter Position entfernen
        System.out.println(list2);

        list2.add(0, "x"); // An gewünschter Position hinzufügen
        System.out.println(list2);

        list2.set(2, "#"); // Ersetzen
        System.out.println(list2);

        for(String e : list2) {
            System.out.print(e + " ");
        }

        System.out.println();

        Iterator<String> it = list2.iterator(); // Iterationsobjekt
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        list2.forEach(e -> System.out.print(e + " "));


        LinkedList<String> list7 = new LinkedList<>(list2); // LinkedList enthält alle Elemente der ArrayList


        List<String> list8 = new ArrayList<>();
        list8.add("a");

        list8 = new LinkedList<>(list8);
    }
}

class Person {

}
