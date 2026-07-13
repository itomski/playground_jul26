package de.lubowiecki;

import java.util.Scanner;

public class Eingaben {

    public static void main(String[] args) {

        System.out.println("START");

        // Scanner zum Scannen der Eingaben über die Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: "); // Ohne Zeilenumbruch
        int eingabe = scanner.nextInt(); // Liest eine Zahl von der Konsole ein
        System.out.println("Deine Eingabe ist: " + eingabe);

        System.out.println("ENDE");
    }
}
