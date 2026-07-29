package de.lubowiecki.time;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeUtils {

    public static final DateTimeFormatter FMT_DATE =  DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    public static final DateTimeFormatter FMT_TIME =  DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
    public static final DateTimeFormatter FMT_DATE_TIME =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

    private TimeUtils() {
    }
}
