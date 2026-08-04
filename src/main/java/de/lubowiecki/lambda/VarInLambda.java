package de.lubowiecki.lambda;

public class VarInLambda {

    static String otherText = "...";

    public static void main(String[] args) {

        String text = "Das ist die Summe: ";

        FuncIn3 fn1 = (a, b) -> text + (a + b);

        // text = "..."; // Lokale Variable: Darf nicht geändert werden, wenn im Lambda verwendet

        FuncIn3 fn2 = (a, b) -> otherText + (a + b);
        otherText = "Moin!..."; // Statische und Instanzvariablen dürfen geändert werden
    }
}

interface FuncIn3 {
    String compute(int a, int b);
}


