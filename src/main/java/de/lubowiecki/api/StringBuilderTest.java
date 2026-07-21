package de.lubowiecki.api;

public class StringBuilderTest {

    public static void main(String[] args) {

        var sb = new StringBuilder(); // Der Kompiler erittelt den Datentyp bei der Deklaration
        sb.append("Hello").append(' ').append("World");

        var sb2 = new StringBuilder();
        sb2.append("Hello").append(' ').append("World");

        var rot = new Schrittzaehler();
        var gruen = new Schrittzaehler();

        rot.next().next().next().reset().next();

        System.out.println("ROT: " + rot.get());
        System.out.println("GRÜN: " + gruen.get());

    }
}

class Schrittzaehler {

    private int schritte;

    public Schrittzaehler next() {
        this.schritte++;
        return this; // this ist eine Referenz auf das Objekt auf dem diese Methode ausgeführt wurde
    }

    public Schrittzaehler reset() {
        this.schritte = 0;
        return this;
    }

    public int get() {
        return schritte;
    }
}