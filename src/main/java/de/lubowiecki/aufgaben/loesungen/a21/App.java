package de.lubowiecki.aufgaben.loesungen.a21;

import java.util.Scanner;

public class App {

    private static final String KEYS = """
            
            ************************************************
            |   1: Espresso
            |   2: Americano
            |   3: Cappuccino
            |   4: Late Macchiato
            |   5: Exit
            ************************************************
            
            """;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Kaffeeautomat automat = new Kaffeeautomat();

        app: while(true) {
            System.out.println(KEYS);
            System.out.print("Wahl: ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1 -> automat.zubereiten(Kaffeeprodukt.ESPRESSO);
                case 2 -> automat.zubereiten(Kaffeeprodukt.AMERICANO);
                case 3 -> automat.zubereiten(Kaffeeprodukt.CAPPUCCINO);
                case 4 -> automat.zubereiten(Kaffeeprodukt.LATE_MACCHIATO);
                // TODO: Nachfüllen
                case 5 -> {
                    break app;
                }
                default -> System.out.println("Fehler!");
            }
        }
    }
}
