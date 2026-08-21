package de.lubowiecki.patterns.builder;

import java.time.LocalDate;

public class BuilderTest {

    public static void main(String[] args) {

        Kunde k1 = new Kunde("Peter", "Parker", LocalDate.of(1995,10,17), KundenArt.PRIVAT);
        Kunde k2 = new Kunde("Bruce", "Parker", LocalDate.of(1995,10,17), KundenArt.PRIVAT);

        KundenBuilder builder = new KundenBuilder();
        builder.setVorname("Peter")
                .setNachname("Parker")
                .setGeburtsDatum(LocalDate.of(1995,10,17))
                .setArt(KundenArt.PRIVAT);

        Kunde k3 = builder.build();

        Kunde k4 = builder.setVorname("Bruce").build();
        Kunde k5 = builder.setVorname("Carol").build();
        Kunde k6 = builder.setVorname("Max").build();
    }
}
