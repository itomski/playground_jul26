package de.lubowiecki.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DatenSpeichern {

    private static final String FILENAME = "data.ser";

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setVorname("Peter");
        person1.setNachname("Parker");

//        Person person2 = new Person("Peter", "Parker");

//        System.out.println(person1);
//        System.out.println(person2);
//
//        System.out.println(person1 == person2); // Referenzvergleich: Ist es das gleiche Objekt auf dem Heap?
//        System.out.println(person1.equals(person2)); // Inhaltsvergleich: Haben beide Objekte den gleichen Inhalt
//
//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());

//        List<Person> personList = new ArrayList<>();
        List<Person> personList = readFromFile();

//        personList.add(person1);
//        personList.add(person2);
//        personList.add(new Person("Bruce", "Banner"));
//        personList.add(new Person("Carol", "Danvers"));

        for(Person person : personList) {
            System.out.println(person);
        }

        //saveToFile(personList);

    }

    private static List<Person> readFromFile() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (List<Person>) ois.readObject(); // Daten aus der Datei werden gelesen und deserialisiert
        }
        catch(IOException | ClassNotFoundException e) {
            // TODO: Exception richtig behandeln
            e.printStackTrace();
            return new ArrayList<>(); // Wenn Daten nicht rekonstruiert werden konnten, gibt es eine leere Liste
        }
    }

    private static void saveToFile(List<Person> personList) {
        // try-with-resources: Schließt automatisch alle geöffneten Resourcen
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(personList); // Liste mit Personen serialisieren und in die Datei schreiben
        }
        catch(IOException e) {
            // TODO: Exception richtig behandeln
            e.printStackTrace();
        }
    }
}
