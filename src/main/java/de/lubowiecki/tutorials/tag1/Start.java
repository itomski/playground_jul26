package de.lubowiecki.tutorials.tag1;

public class Start {

    // Einstieg für den Interpreter
    public static void main(String[] args) {
        // Hier startet die Ausführung

        Katze k1 = new Katze(); // Aus dem Bauplan wird ein konkreter Vertreter der Katzen gebaut
        //k1.name = "Hans"; // Error
        k1.setName("Hans"); // Ok


    }
}