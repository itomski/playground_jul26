package de.lubowiecki.aufgaben.loesungen.a27;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker", LocalDate.of(1990, 1, 25));

        System.out.println(p1);
        System.out.println(p1.getGeburtsdatumFormatiert());

        Person p2 = new Person("Steve", "Rogers", LocalDate.of(1912, 5, 9));

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.getGeburtsdatum().isAfter(p2.getGeburtsdatum()));

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(new Person("Bruce", "Banner", LocalDate.of(1973, 10, 15)));
        people.add(new Person("Carol", "Danvers", LocalDate.of(1985, 1, 2)));

        // Geordner - Einfügereihenfolge
        System.out.println(people);

        Collections.sort(people);

        System.out.println();

        Comparator<Person> nachGeburtsdatum = Comparator.comparing(Person::getGeburtsdatum);
        Comparator<Person> nachVorname = Comparator.comparing(Person::getVorname);
        Comparator<Person> nachNachname = Comparator.comparing(Person::getNachname);

        System.out.println();
        //Collections.sort(people, nachGeburtsdatum);
        people.sort(nachGeburtsdatum); // sort von List braucht IMMER einen Comparator
        //Collections.sort(people); // Vergleicht nach compareTo von Person
        System.out.println(people);

        System.out.println();
        people.sort(nachVorname);
        System.out.println(people);

        System.out.println();
        //people.sort(nachNachname);
        people.sort(nachNachname.reversed());
        System.out.println(people);

        System.out.println();
        people.sort(nachNachname.thenComparing(nachVorname));
        System.out.println(people);
    }
}
