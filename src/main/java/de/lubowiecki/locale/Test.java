package de.lubowiecki.locale;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CHINA);

        DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(FMT));

        int zahl = 20000;
        double andereZahl = 20.123;

        System.out.println(zahl);
        System.out.println(andereZahl);

        NumberFormat DE_FORMAT = NumberFormat.getInstance(); // Land und Sprache werden über das System ermittelt
        System.out.println(DE_FORMAT.format(zahl));
        System.out.println(DE_FORMAT.format(andereZahl));

    }
}
