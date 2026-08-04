package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class BuildInFunc {

    public static void main(String[] args) {

        DoubleBinaryOperator op1 = (a, b) -> a * b;
        System.out.println(op1.applyAsDouble(10.7, 15.2));

        UnaryOperator<String> uop1 = s -> s.trim().toUpperCase();

        Function<String, Integer> intParser = s -> Integer.parseInt(s);

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Peter", "Bruce", "Carol", "Scott"));// Collection
        namen.stream(); // Stream

        System.out.println();

        // void accept(T t)
        Consumer<String> c1 = s -> System.out.println(s + "...");
        Consumer<Integer> c2 = i -> System.out.println(i * 10);
        namen.forEach(c1);
        namen.forEach(s -> System.out.print(s + ", "));
        System.out.println();
        namen.forEach(System.out::println);

        System.out.println();

        //  R apply(T t);
        Function<String, Integer> f1 = s -> Integer.parseInt(s);
        int i = f1.apply("123");
        System.out.println(i + 10);

        // Function<String, String> f2 = s -> s.trim().toUpperCase();
        UnaryOperator<String> f2 = s -> s.trim().toUpperCase(); // Funktion bei der Eingangs- und Rückgabetyp gleich sind
        String str = f2.apply(" abc  ");
        System.out.println(str);

        System.out.println();

        // R apply (T t, U u)
        BiFunction<String, String, Integer> f3 = (a, b) -> Integer.parseInt(a + b);
        int zahl = f3.apply("12", "345");
        System.out.println(zahl);

        System.out.println();

        // R get()
        final Supplier<Integer> W6 = () -> (int)(Math.random() * 6) + 1;
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());

        System.out.println();

        // boolean test(T t)
        Predicate<String> p1 = s -> s.startsWith("P");
        System.out.println(p1.test("Peter"));
        System.out.println(p1.test("Carol"));
        System.out.println(namen);
        namen.removeIf(p1);
        System.out.println(namen);

        /*
        Consumer (BiConsumer)
        Function (BiFunction, UnaryOperator, BinaryOperator)
        Supplier
        Predicate

        // für int, double, long (und boolean)
        IntConsumer
        DoubleUnaryOperator
        LongSupplier
        IntPredicate
        IntToDoubleFunction (primitiv int zu primitiv double)
         */
    }
}
