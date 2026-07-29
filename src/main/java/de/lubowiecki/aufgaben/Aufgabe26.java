package de.lubowiecki.aufgaben;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aufgabe26 {

    /*
    Schreibe ein Programm, welches vom User 3 Zahlen entgegennimmt und daraus ein LocalDate erzeugt.
    Gebe es aus.
    Danach verschiebe das Datum um 15 Tage und 3 Monate in die Zukunft.
    Gebe es aus.

    Erzeuge ein zweites LocalDate und errechne danach den Abstand in Tagen zwischen beiden.
     */

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate later = LocalDate.now().plusDays(250);
        long days = Duration.between(now.atStartOfDay(), later.atStartOfDay()).toDays();
        System.out.println(days);

        days = now.until(later, ChronoUnit.DAYS);
        System.out.println(days);
    }
}
