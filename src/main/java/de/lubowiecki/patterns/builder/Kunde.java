package de.lubowiecki.patterns.builder;

import java.time.LocalDate;

// Immutable
public class Kunde {

    private final String vorname;
    private final String nachname;
    private final LocalDate geburtsDatum;
    private final KundenArt art;

    public Kunde(String vorname, String nachname, LocalDate geburtsDatum, KundenArt art) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.art = art;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public KundenArt getArt() {
        return art;
    }
}
