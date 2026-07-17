package de.lubowiecki.arrays;

import java.time.LocalDateTime;

public class Parkhaus {

    static Pkw[] parkplaetze = new Pkw[10];

    static int naechsterFreierPlatz = 0;

    public static void main(String[] args) {

        einparken("HH:AB123");
        einparken("B:XY256");
        einparken("HB:RX356");

        zeigeParkplaetze();

        System.out.println("\nAusparken:");

        Pkw pkw = ausparken("HB:RX356");
        if(pkw == null) {
            System.out.println("Gesuchter PKW ist nicht in diesem Parkhaus");
        }
        else {
            System.out.println(pkw);
        }
    }

    public static Pkw ausparken(String kennzeichen) {

        for (int i = 0; i < parkplaetze.length; i++) {

            if(parkplaetze[i] == null) continue; // Springt zum nächsten Durchgang der Schleife

            if(parkplaetze[i].getKennzeichen().equals(kennzeichen)) {
                // Gefunden
                Pkw pkw = parkplaetze[i];
                parkplaetze[i] = null; // Parkplatz verlassen
                pkw.jetztAusparken();
                return pkw;
            }
        }
        // Nicht gefunden
        return null;
    }

    private static void zeigeParkplaetze() {
        for(Pkw p : parkplaetze) {
            if(p == null) {
                System.out.println("Frei");
            }
            else {
                System.out.println(p);
            }
        }
    }

    private static void einparken(String kennzeichen) {
        Pkw pkw = new Pkw(kennzeichen);
        parkplaetze[naechsterFreierPlatz] = pkw;
        naechsterFreierPlatz++;
    }
}

class Pkw {

    private String kennzeichen;
    private LocalDateTime einparkZeit;
    private LocalDateTime ausparkZeit;

    public Pkw(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        einparkZeit = LocalDateTime.now();
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void jetztAusparken() {
        ausparkZeit = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Pkw{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", einparkZeit=" + einparkZeit +
                ", ausparkZeit=" + ausparkZeit +
                '}';
    }
}
