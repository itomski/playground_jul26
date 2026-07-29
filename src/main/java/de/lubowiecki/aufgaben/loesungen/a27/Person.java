package de.lubowiecki.aufgaben.loesungen.a27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

// Comparable = Vergleichbar/Sortierbar
public class Person implements Comparable<Person> {

    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Person(String vorname, String nachname, LocalDate geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
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

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getGeburtsdatumFormatiert() {
        return geburtsdatum.format(FMT);
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname) && Objects.equals(geburtsdatum, person.geburtsdatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtsdatum);
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum.format(FMT) +
                '}';
    }

    // Natürliche Ordnung
    @Override
    public int compareTo(Person other) {
        // -1 = kleiner
        // 1 = größer
        // 0 = gleich
        return geburtsdatum.compareTo(other.geburtsdatum);
        //return vorname.compareTo(other.vorname);
    }
}
