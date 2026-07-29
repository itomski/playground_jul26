package de.lubowiecki.time;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) {

        // Viele Methoden und Konstruktoren sind deprecated
        // Sollte nicht mehr verwendet werden
        Date now = new Date();
        now = new Date(2000, 10, 15);
        System.out.println(now);

        System.out.println();

        // Ist immer noch aktuell
        java.sql.Date next = new java.sql.Date(System.currentTimeMillis());
        System.out.println(next);

        System.out.println();

        // Haben private Konstruktoren
        LocalDate ld = LocalDate.now(); // Datum (Jahr, Monat, Woche, Tag)
        ld = LocalDate.of(2000, 10, 15);
        System.out.println(ld);
        ld = LocalDate.of(2000, Month.APRIL, 15);
        System.out.println(ld);
        System.out.println("Tag der Woche: " + ld.getDayOfWeek());
        System.out.println("Tag des Jahres: " + ld.getDayOfYear());
        System.out.println("Tag des Monats: " + ld.getDayOfMonth());
        System.out.println("Monat: " + ld.getMonth());
        System.out.println("Monat: " + ld.getMonthValue());

        // Jede Zeit-Klasse unterstützt nur passende ChronoField-Optionen
        // System.out.println(ld.get(ChronoField.MICRO_OF_DAY)); // UnsupportedTemporalTypeException

        // Interface          Enum
        // TemporalField tf = ChronoField.MONTH_OF_YEAR;

        System.out.println();
        LocalTime lt = LocalTime.now(); // Zeit (Std, Min, Sek, etc.)
        System.out.println(lt);
        LocalDateTime ldt_ = lt.atDate(LocalDate.now()); // Verbindet Zeit mit einem Datum
        lt = lt.plusHours(2);
        lt = lt.minusSeconds(20);
        System.out.println(lt);
        lt = lt.minus(Duration.ofHours(10));
        lt = lt.minus(10, ChronoUnit.HOURS);

        LocalTime mittag = LocalTime.of(12,0);
        System.out.println(lt.isBefore(mittag)); // Prüft, ob es vor einem Zeitpunkt liegt

        System.out.println();
        LocalDateTime ldt = LocalDateTime.now(); // Datum + Uhrzeit
        System.out.println(ldt);

        // Wird bei der Erzeugung gegen einen Kalender validiert
        // LocalDate ld2 = LocalDate.of(2015, 2, 30); // DateTimeException

        System.out.println();

        Year y =  Year.now();
        System.out.println(y);
        YearMonth ym =  YearMonth.now();
        System.out.println(ym);
        MonthDay md = MonthDay.now();
        System.out.println(md);
        Month m = Month.JULY;
        System.out.println(m);
    }
}
