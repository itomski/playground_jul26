package de.lubowiecki.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TryWithResourcesTest {

    public static void main(String[] args) {

        try(Writer out = new FileWriter("data2.txt"); BufferedWriter bw = new BufferedWriter(out)) { // Hier wird die Ressource geöffnet
            bw.write("Hello"); // Schreiben
            // Hier wird die Ressource automatisch geschlossen (auch bei einer Exception)
        }
        catch (IOException e) {
            System.out.println("Problem beim Zugriff auf eine Datenquelle");
        }

        Writer out = null;
        try {
            // catch für Checked-Exceptions NUR erlaubt, wenn im try auch eine auftauchen könnte
            // Ausnahme: Exception

            out = new FileWriter("data2.txt");

            out.write("Hello"); // Schreiben

            // Resource wird NICHT automatisch geschlossen!!!
            out.close(); // Resource wird geschlossen
        }
        catch(IOException e) {
            System.out.println("Problem beim Zugriff auf eine Datenquelle");

            if(out != null) {
                try {
                    out.close();
                }
                catch (IOException ex) {
                    // Problem beim Schließen
                }
            }
        }

        try {
            writeToFile("Das ist ja toll!!!");
        }
        catch (IOException e) {
            System.out.println("Problem beim Schreiben");
        }
    }

    private static void writeToFile(String text) throws IOException {

        try(BufferedWriter out = new BufferedWriter(new FileWriter("data2.txt"))) { // Hier wird die Ressource geöffnet
            out.write(text); // Schreiben
        } // Hier wird die Ressource automatisch geschlossen (auch bei einer Exception)
    }
}
