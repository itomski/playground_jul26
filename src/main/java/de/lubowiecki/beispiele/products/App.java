package de.lubowiecki.beispiele.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Produkt> produkte = new ArrayList<>();

    private static final String ROW_TPL = "| %-15s | %-20s | %5d | %6.2f | \n";

    public static void main(String[] args) {

        app: while(true) {
            // TODO: Menü anzeigen
            System.out.print("Auswahl: ");
            int auswahl = scanner.nextInt();

            switch(auswahl) {
                case 1 -> addProduct();
                case 2 -> showProducts();
                case 3 -> System.out.println("Keine Funktionalität");
                case 0 -> {
                    System.out.println("Programm verlassen");
                    break app; // bricht die Schleife mit dem label app ab
                }
                default -> System.out.println("Falsche Auswahl");
            }
        }
        System.out.println("Programm beendet!");
    }

    private static void showProducts() {
        System.out.println("\nProduktliste\n");
        for (Produkt p : produkte) {
            System.out.printf(ROW_TPL, p.getName(), p.getBeschreibung(), p.getAnzahl(), p.getPreis());
        }
    }

    private static void addProduct() {
        System.out.println("\nNeues Produkt");
        scanner.nextLine(); // fix
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Beschreibung: ");
        String beschreibung = scanner.nextLine();
        System.out.print("Anzahl: ");
        int anzahl = scanner.nextInt();
        System.out.print("Preis: ");
        double preis = scanner.nextDouble();
        Produkt p = new Produkt(name, beschreibung, anzahl, preis); // Produkt erzeugen
        if(produkte.add(p)) {
            System.out.println("Produkt in der Liste gespeichert.");
            // Zu Liste hinzufügen
        }
    }


}
