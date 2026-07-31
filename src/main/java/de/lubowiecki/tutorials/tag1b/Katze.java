package de.lubowiecki.tutorials.tag1b;

public class Katze {

    // nicht static = gehört dem Objekt

    // Beschreibt welche Eigenschaften und Fähigkeiten jede Katze hat
    private String name;
    private String rasse;
    private int alter;

    // static = gehört der Klasse

    private static int anzahl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
