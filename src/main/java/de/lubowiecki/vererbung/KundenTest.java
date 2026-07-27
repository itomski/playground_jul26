package de.lubowiecki.vererbung;

import java.time.LocalDate;

public class KundenTest {

    public static void main(String[] args) {

        Kunde k1 = new Kunde("Peter", "Parker");
        k1.sagHallo();

        Kunde k2 = new Kunde("Carol", "Danvers");
        k2.sagHallo();

        BestandsKunde bk1 = new BestandsKunde("Steve", "Rogers", LocalDate.of(1985, 10, 1));
        bk1.sagHallo();

    }
}

class Kunde {

    String vorname;
    String nachname;

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void sagHallo() {
        System.out.println("Hallo! Mein Name ist " + this.vorname + " " + this.nachname);
    }
}

class BestandsKunde extends Kunde {

    // vorname und nachname wurden geerbt
    LocalDate imBestandSeit;

    public BestandsKunde(String vorname, String nachname, LocalDate imBestandSeit) {
        super(vorname, nachname); // Aufruf des Konstruktors der Elternklasse
        this.imBestandSeit = imBestandSeit;
    }

    // Wurde bereits geerbt
//    public void sagHallo() {
//        System.out.println("Hallo! Mein Name ist " + this.vorname + " " + this.nachname);
//    }

    @Override
    public void sagHallo() {
        super.sagHallo(); // Ruft die sagHallo aus Kunde (Elternkasse) auf
        System.out.println("Ich bin Bestandskunde seit " + this.imBestandSeit.getYear());
    }
}
