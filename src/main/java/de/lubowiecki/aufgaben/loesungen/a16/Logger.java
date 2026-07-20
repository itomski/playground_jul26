package de.lubowiecki.aufgaben.loesungen.a16;

import java.time.LocalDateTime;

public class Logger {

    private StringBuilder protokoll = new StringBuilder();

    private static final Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg, String level) {
        // TODO: Silent Flag beachten
        protokoll.append(LocalDateTime.now()) // TODO: Datum formatieren
                .append(": ")
                .append(level) // TODO: Levels vordifinieren
                .append(" - ")
                .append(msg)
                .append("\n");
    }

    public void printLog() {
        System.out.println(protokoll);
    }
}
