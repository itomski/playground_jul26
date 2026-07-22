package de.lubowiecki.io;

import java.io.Serializable;
import java.util.Objects;

// implements Serializable = als serialisierbar markiert
public class Person implements Serializable {

    private static int count;

    private int id;
    private String vorname;
    private String nachname;

    public Person() {
        this.id = ++count;
    }

    public Person(String vorname, String nachname) {
        this(); // Aufruf des eigenen parameterlosen Konstruktors
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // Soll ein Inhaltsvergleich erfolgen MUSS equals passend eingebaut werden
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    // API Contract verlangt, dass zwei Objekt, die per equals gleich sind
    // den gleichen hashCode lieferen
    // MUSS auf den gleichen Attributen basieren, wie equals
    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
