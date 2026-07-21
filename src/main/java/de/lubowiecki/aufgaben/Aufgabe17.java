package de.lubowiecki.aufgaben;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aufgabe17 {

    /*
    Schreibt eine Liste mit 12 Zufallszahlen zwischen 1 und 6;
    Gibt die Liste aus.

    Danach entferne alle Elemente kleiner als 3.
    Und füge 2 weitere Zufallszahlen dazu.


    Schreibt eine Liste von 10 Personen. Jede Person hat einen Vor- und Nachnamen.
    Entferne alle Personen deren Nachname mit "M" beginnt (mind. 1)
    Gibt die Liste Zeile für Zeile aus.
    */

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(3);
        zahlen.add(2);
        zahlen.add(6);
        zahlen.add(5);
        zahlen.add(2);
        zahlen.add(1);

//        for (Integer i : zahlen) {
//            if(i < 3) zahlen.remove(i); // ConcurrentModificationException
//        }

//        for (int i = 0; i < zahlen.size(); i++) {
//            if(zahlen.get(i) < 3) {
//                zahlen.remove(i);
//            }
//        }

        System.out.println(zahlen);

        Iterator<Integer> iterator = zahlen.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() < 3) iterator.remove(); // Entfernen, wenn kleiner 3
        }

        System.out.println();

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter"));
        personen.add(new Person("Bruce"));
        personen.add(new Person("Scott"));
        personen.add(new Person("Natasha"));
        personen.add(new Person("Carol"));
        personen.add(new Person("Steve"));
        personen.add(new Person("Toni"));

        System.out.println(personen);

        Iterator<Person> itr = personen.iterator();
        while(itr.hasNext()) {
            Person p = itr.next();
            if(p.name.startsWith("S")) {
                itr.remove();
            }
        }

        System.out.println(personen);
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
