package de.lubowiecki.oop;

// import java.util.Date;
// import java.sql.Date;

// Inhalt von Package java.lang ist automatisch importiert

import java.util.*; // Importiert alle Klassen aus diesem Package
import java.util.zip.*; // Unter-Packages müssen extra importiert werden

//import java.util.Scanner;

public class PackageTest {

    public static void main(String[] args) {

        java.util.Date heute = new java.util.Date();
        System.out.println(heute);

        java.sql.Date heuteSQL = new java.sql.Date(System.currentTimeMillis());
        System.out.println(heuteSQL);

        Scanner scanner = new Scanner(System.in);

    }
}
