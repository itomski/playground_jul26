package de.lubowiecki.streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratorTest {

    static final String[] FNAME = {"Peter", "Bruce", "Natasha", "Tony", "Scott", "Carol"};
    static final String[] LNAME = {"Parker", "Banner", "Romanov", "Stark", "Lang", "Danvers"};
    static final Random random = new Random();

    public static void main(String[] args) {

        Supplier<Person> personSupplier = () -> {
            String vorname = FNAME[random.nextInt(6)];
            String nachname = LNAME[random.nextInt(6)];
            return new Person(vorname, nachname);
        };

        Stream<Person> pStream = Stream.generate(personSupplier);

        Set<Person> personen = pStream.distinct()
                                        .limit(15)
                                        .collect(Collectors.toSet());

        for (Person person : personen) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        System.out.println();

        // Nach der Ausführung einer Terminal-Operation ist ein Stream verbraucht
        //pStream.forEach(System.out::println); // IllegalStateException: Stream ist bereits verbraucht

        System.out.println("--------------------------------------");

        Map<String, List<Person>> groups = Stream.generate(personSupplier)
                                                .limit(50)
                                                .collect(Collectors.groupingBy(Person::getFirstName));

        System.out.println(groups);
        System.out.println(groups.get("Scott"));

        System.out.println("--------------------------------------");

        Map<Boolean, List<Person>> otherGroups = Stream.generate(personSupplier)
                .limit(50)
                .collect(Collectors.partitioningBy(p -> p.getFirstName().startsWith("S")));

        System.out.println(otherGroups);
        System.out.println(otherGroups.get(true));
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
