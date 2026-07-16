package de.lubowiecki.oop;

import java.util.Arrays;

public class OverloadingTest {

    public static void main(String[] args) {

        // Überladen: Die Paremeterliste muss sich im Typ, Anzahl oder Reihenfolge unterscheiden

        machWas(10);
        // machWas(); // VarArg
        // machWas(10, 15, 22, 17); // VarArg

        // 1. Aufruf einer Methode mit dem passenden Parametertyp
        // 2. Aufruf einer Methode mit dem einem größeren Parametertyp (primitive Widening)
        // 3. Aufruf einer Methode mit dem einem passenden Wrappertyp (Autoboxing - Primitiver Wert wird in ein Objekt verpackt)
        // 4. Aufruf einer Methode mit dem einem größeren komplexen Parametertyp (komplex Widening)
        // 5. Aufruf einer passenden Methode mit einem VarArg

    }

    private static void machWas(byte v) {
        System.out.println("byte");
    }

//    private static void machWas(int v) {
//        System.out.println("int");
//    }

    // byte < short < int < long < float < double

//    private static void machWas(long v) {
//        System.out.println("long");
//    }

//    private static void machWas(double v) {
//        System.out.println("double");
//    }

    private static void machWas(Integer v) {
        System.out.println("Integer");
    }

    private static void machWas(int... v) {
        System.out.println("int VarArg");
        System.out.println(Arrays.toString(v)); // v ist ein Array
    }
}
