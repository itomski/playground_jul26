package de.lubowiecki.exceptions;

import java.io.*;

public class CheckedTest {

    public static void main(String[] args) throws IOException {

        // Checked Exceptions müssen behandelt oder deklariert werden
        // Ansonsten kompiliert der Sourcecode NICHT!
        try {
            Writer out = new FileWriter("datei.txt");
            out.write("Das ist das Haus von Nikigraus!");
            out.flush();
        }
        catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
        catch (IOException e) {
            System.out.println("Kann nicht in die Datei schreiben");
        }

        //...

        try {
            Writer out = new FileWriter("datei.txt");
            out.write("Das ist das Haus von Nikigraus!");
            out.flush();
        }
        catch(Exception e) {
            System.out.println("Problem!");
        }

        // Behandlung nötig
        writeToFile("Das ist ja....");
    }

    // throws... Methode wird als gefährlich deklariert
    // Der Aufrufer DIESER Methode muss sich um Behandlung kümmern
    static void writeToFile(String text) throws IOException {
        Writer out = new FileWriter("datei.txt");
        out.write(text);
        out.flush();
    }
}
