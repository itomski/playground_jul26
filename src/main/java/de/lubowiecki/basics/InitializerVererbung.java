package de.lubowiecki.basics;

import static java.lang.System.out;
import static java.lang.System.err;

public class InitializerVererbung {

    public static void main(String[] args) {

        // int out = 15; // Überlagert den statischen import

        C c = new C();
        System.out.println();
        B b = new B();

        System.out.println();

        System.out.println("Moin");
        System.err.println("Moin");

        out.println("Moin");
        err.println("Moin");
    }
}

class A {

    static {
        System.out.println("SI: A");
    }

    {
        System.out.println("II: A");
    }

    public A() {
        super();
        // <--- Initializer
        System.out.println("C: A");
    }
}

class B extends A {

    static {
        System.out.println("SI: B");
    }

    {
        System.out.println("II: B");
    }

    public B() {
        super();
        // <--- Initializer
        System.out.println("C: B");
    }
}

class C extends B {

    static {
        System.out.println("SI: C");
    }

    {
        System.out.println("II: C");
    }

    public C() {
        super();
        // <--- Initializer
        System.out.println("C: C");
    }
}
