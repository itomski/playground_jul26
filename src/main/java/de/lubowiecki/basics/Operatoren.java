package de.lubowiecki.basics;

public class Operatoren {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        System.out.println(a & b); // AND
        // a = 00001010
        // b = 00001111
        // & = 00001010

        System.out.println(a | b); // OR
        // a = 00001010
        // b = 00001111
        // | = 00001111

        System.out.println(a ^ b); // XOR
        // a = 00001010
        // b = 00001111
        // ^ = 00000101

        System.out.println();

        int i = 10;

        // prefix
        int j = ++i; // i zuerst incrementiert und dann auf j zugewiesen
        System.out.println(i);
        System.out.println(j);

        System.out.println();

        // postfix
        j = i++; // i zuerst auf j zugewisen und dann i incrementiert
        System.out.println(i);
        System.out.println(j);

        i = 0;
                        // 0   +   2 +   1
        System.out.println(i++ + ++i + --i);

        System.out.println();
        j = 10;
        j = j++; // Postfix geht durch die Neuzuweisung der Varaible verloren
        System.out.println(j);

    }
}
