package de.lubowiecki.patterns.builder;

import java.time.LocalDate;

public class KundenBuilder {

    private String vorname;
    private String nachname;
    private LocalDate geburtsDatum;
    private KundenArt art;

    public String getVorname() {
        return vorname;
    }

    public KundenBuilder setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public KundenBuilder setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public KundenBuilder setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
        return this;
    }

    public KundenArt getArt() {
        return art;
    }

    public KundenBuilder setArt(KundenArt art) {
        this.art = art;
        return this;
    }

    public Kunde build() {
        return new Kunde(vorname, nachname, geburtsDatum, art);
    }
}
