package de.lubowiecki.lambda;

import java.util.function.Consumer;

public class BindingTest {

    public static void main(String[] args) {
        new BindingTest().start(); // Wechseln vom statischen Kontext auf Instanzkontext
    }

    private void start() {
        // this ist eine Referenz auf ein BindingTest-Objekt
        System.out.println(this.toString());

        Consumer<String> cons1 = s -> System.out.println(this); // Hat kein eigenes this
        cons1.accept("ABC");


        // Anonyme Klasse
        Consumer<String> cons2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(this); // Haben ein eigenes this
            }
        };
        cons2.accept("ABC");
    }
}

@FunctionalInterface
interface FuncIn4 {

    // abstrakte Methode
    String compute(int a, int b);

    // String compute(int a);

    @Override
    String toString(); // Alle Methoden von Object werden im SAM als abstrakte Methoden ignoriert

    @Override
    int hashCode();
}
