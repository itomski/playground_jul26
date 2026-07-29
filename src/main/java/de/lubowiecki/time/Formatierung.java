package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatierung {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println(FMT_DATE.format(now));
        System.out.println(now.format(FMT_DATE));

        String strDate = "17.08.2025";
        // LocalDate selection = LocalDate.parse(strDate); // ISO: DateTimeParseException
        LocalDate selection = LocalDate.parse(strDate, FMT_DATE);
        System.out.println(selection);
        System.out.println(selection.format(FMT_DATE));

        final DateTimeFormatter FMT_DATE_TIME = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        //System.out.println(selection.format(FMT_DATE_TIME)); // UnsupportedTemporalTypeException: keine Zeit enthalten

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(FMT_DATE_TIME));

        System.out.println("------------------");

        Locale.setDefault(Locale.GERMANY);
        final DateTimeFormatter FMT_LOC =  DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(now.format(FMT_LOC));

        // FULL braucht eine Zeitzone
        final DateTimeFormatter FMT_LOC_2 =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        // System.out.println(LocalDateTime.now().format(FMT_LOC_2)); // DateTimeException

        System.out.println(LocalDateTime.now().format(TimeUtils.FMT_DATE));
    }
}
