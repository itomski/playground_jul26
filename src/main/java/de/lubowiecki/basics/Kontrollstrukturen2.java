package de.lubowiecki.basics;

public class Kontrollstrukturen2 {

    public static void main(String[] args) {

        String eingabe = " skadhds  ";

        // trim entfernt Lerzeichen, Zeilenumbrüche und Tabs an beiden Enden der Zeichenkette

        // switch kann Ganzzahlentypen (ohne long), char, Strings und ENUMs verarbeiten
        // Cases MÜSSEN einzigartig sein

        switch(eingabe.trim().toLowerCase()) {
            case "produkte":
                System.out.println("... Produktliste...");
                break;

            case "services":
                System.out.println("... Unsere Services...");
                break;

            case "kontakt":
                System.out.println("... So erreichen Sie uns...");
                break;

            case "exit":
                System.out.println("... Programm beendet...");
                break;

            default:
                System.out.println("Falscheingabe!");
        }

        System.out.println();

        // breaks werden automatisch nach jedem case gesetzt
        switch(eingabe.trim().toLowerCase()) {
            case "produkte" -> System.out.println("... Produktliste...");
            case "services" -> System.out.println("... Unsere Services...");
            case "kontakt" -> System.out.println("... So erreichen Sie uns...");
            case "exit" -> { // Block nötig, wenn mehrere Anweisungen in dem case enthalten sein sollen
                System.out.println("... Programm beendet...");
                System.out.println("STOP!");
            }
            default -> System.out.println("Falscheingabe!");
        }

        int zahl = 25;

        String name = switch(zahl) {
                        case 1 -> "Peter";
                        case 2 -> "Carol";
                        case 3 -> "Natasha";
                        case 4 -> "Bruce";
                        case 5 -> "Steve";
                        default -> "Unbekannt";
                    };

        System.out.println(name);

        System.out.println();

        String tag = "SO";

        System.out.println("Tage bis zum Wochenende: ");
        switch(tag) {
            case "MO":
                System.out.println("Montag");

            case "DI":
                System.out.println("Dienstag");

            case "MI":
                System.out.println("Mittwoch");

            case "DO":
                System.out.println("Donnerstag");

            case "FR":
                System.out.println("Freitag");
                break;

            case "SA":
            case "SO":
                System.out.println("WOCHENENDE");
                break;

            default:
                System.out.println("Falscheingabe!");
        }


    }
}
