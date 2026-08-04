package de.lubowiecki.design;

// zum Verwenden vom statischen Inventar kann ein static import erfolgen

import static java.lang.Math.pow;
import static java.lang.Math.PI;
// import static java.lang.Math.*; // Importiert das ganze statische Inventar

import static de.lubowiecki.design.InnerClasses.*;
import static de.lubowiecki.design.FormatStyle.*;

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(Math.pow(2,5));
        System.out.println(Math.PI);

        System.out.println(pow(2,5));
        System.out.println(PI);

        StaticInner inner = new StaticInner();

        System.out.println(FormatStyle.LONG);
        System.out.println(LONG); // Möglich wegen dem statischen Import
    }
}
