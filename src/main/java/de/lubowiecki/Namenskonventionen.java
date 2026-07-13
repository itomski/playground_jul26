package de.lubowiecki;

public class Namenskonventionen {

    // PascalCase: Klassennamen
    // camelCase: Variablen- und Methodennamen
    // snake_case: Wird in Java nicht verwendet / Kann für lokale Variablen genutzt werden
    // SCREAMING_SNAKE_CASE: Wird für Konstanten verwendet
    // kebal-case: Wird in Java NICHT verwendet

    // Konstanze = Nach der ersten Zuweisung kann der Wert nicht mehr geändert werden

    // Funktionen die zu einer Klasse gehören nennt man Methoden
    // In Java muss jede Funktion in eine Klasse verpackt werden d.h. es gibt NUR methoden - keine Funktionen

    public static void main(String[] args) {

        // System: Klasse
        // out: Variable
        // println(): Methode
        System.out.println("Moin");

        // Math: Klasse
        // PI: Konstante
        // pow(): Methode
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,5));
    }
}

// Funktionsdefinition
//function machWas() {
//    //...
//}
//
// Funktionsaufruf
//machWas();