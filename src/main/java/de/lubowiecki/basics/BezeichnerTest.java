package de.lubowiecki.basics;

public class BezeichnerTest {

    public static void main(String[] args) {

        int moin;
        int _moin;
        int $moin;
        // int 123moin; // Error: Zahlen am Anfang
        // int @moin; // Error: Nicht erlaubtes Zeichen
        // int switch; // Error: Schlüsselwort
        //int swi tch; // Error: Lerrzeichen
        int swi, tch; // Ok: 2 Variablen vom Typ int
        int Switch; // Ok:

        int[] a, b; // 2 int-Arrays
        int c[], d; // 1 int-Array und ein int
        int[] e[], f; // 1 int-2d-Array und ein int-Array

    }
}
