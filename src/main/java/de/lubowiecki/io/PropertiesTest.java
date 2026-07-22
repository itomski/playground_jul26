package de.lubowiecki.io;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("benutzername", "admin");
        properties.put("passwort", "geheim#123");
        properties.put("db.url", "localhost");
        properties.put("db.port", "8889");
        properties.put("db.user", "root");

        System.out.println(properties);
        System.out.println(properties.getProperty("db.url"));
        System.out.println(properties.getProperty("db.user")); // Wenn nicht verfügbar gibt es null
        System.out.println(properties.getOrDefault("db.user", "unbekannt")); // Wenn nicht verfügbar gibt es defaultwert

        // Output = Schreiben
//        try(OutputStream out = new FileOutputStream("config.properties")) {
//            properties.store(out, null); // Schreibt die Properties in die verbundene Datei
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        final String CONFIG_FILE = System.getProperty("user.home") + "/config.xml";

        try(OutputStream out = new FileOutputStream(CONFIG_FILE)) {
            properties.storeToXML(out, null); // Schreibt die Properties in die verbundene Datei
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------");

        properties = new Properties(); // Leer
        System.out.println(properties);

        // Input = Lesen
        try(InputStream in = new FileInputStream(CONFIG_FILE)) {
            properties.loadFromXML(in); // Properties-Objekt wird mit den Daten aus der Datei gefüllt
            // properties.load(in); // bei einer Datei mit der Endung .properties
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties);

        System.out.println();

        System.out.println(System.getProperties()); // Einstellungen des Systems und des JVM
        System.out.println(System.getProperty("user.home"));
    }
}
