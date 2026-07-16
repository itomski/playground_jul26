package de.lubowiecki.exaple;

import java.util.Scanner;

public class ControllerTest {

//    private static final String MENU = "\n*************************************\n" +
//                                        "\t 1 : Person erfassen \n" +
//                                        "\t 2 : Alle Personen anzeigen \n" +
//                                        "\t 3 : Person bearbeiten \n" +
//                                        "*************************************\n";

    private static final String MENU = """
                                        *************************************
                                        \t 1 : Person erfassen
                                        \t 2 : Alle Personen anzeigen
                                        \t 3 : Person bearbeiten
                                        \t Q : Programm verlassen
                                        *************************************
                                        """;

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Label
        app: while(true) {
            System.out.println(MENU);

            switch(readString("Auswahl").toLowerCase()) {
                case "1" -> System.out.println("Person wird erfasst");
                case "2" -> System.out.println("Personenliste wird angezeigt");
                case "3" -> System.out.println("Person wird bearbeitet");
                case "q" -> {
                    System.out.println("Programm wird beendet");
                    break app; // Bricht die Struktur mit dem Label app ab.
                }
                default -> System.out.println("Falsche Auswahl");
            }

//            String name = readString("Name");
//            String beschreibung = readString("Beschreibung");
//            System.out.println(name + ", " + beschreibung);
        }
    }

    private static String readString(String label) {
        System.out.print(label + " ");
        String eingabe = SCANNER.nextLine();
        if(eingabe.isEmpty()) {
            eingabe = "Leer!";
        }
        return eingabe;
    }
}
