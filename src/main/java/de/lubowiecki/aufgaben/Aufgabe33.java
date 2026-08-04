package de.lubowiecki.aufgaben;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Aufgabe33 {

    /*
    Schreibe für jeden der folgenden Buld-In-Functional-Interfaces eine Implementierung

    Consumer (BiConsumer)
    Function (BiFunction, UnaryOperator, BinaryOperator)
    Supplier
    Predicate

    // für int, double, long (und boolean)
    IntConsumer
    DoubleUnaryOperator
    LongSupplier
    IntPredicate
    IntToDoubleFunction (primitiv int zu primitiv double)...
     */

    public static void main(String[] args) {

        Predicate<String> pred1 =  str -> str != null;

        System.out.println(pred1.test("a"));
        Predicate<String> pred2 = pred1.and(str -> str.length() > 0);

        System.out.println(pred2.test("a"));
        System.out.println(pred2.negate().test("a"));

        Style style = Style.LONG;

        Consumer<String> cons = switch(style) {
            case SHORT -> s -> System.out.println(s + "..........");
            case MEDIUM -> s -> System.out.println(s + "......");
            case LONG -> s -> System.out.println(s + "..");
            default -> System.out::println;
        };

        cons.accept("kadshsdlsdjö");

        print(cons, "Das ist ja super!");
    }

    public static void print(Consumer<String> c, String s) {
        for (int i = 0; i < 5; i++) {
            c.accept(s);
        }
    }
}

enum Style {
    SHORT, MEDIUM, LONG;
}
