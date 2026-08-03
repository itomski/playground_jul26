package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest1 {

    public static void main(String[] args) {


        MathOp op = (a, b) -> a + b;

        // Type Inference für Rückgabetyp und Parametertyp

        // void accept(T t);
        Consumer<String> cons = s -> System.out.println(s);

        // Jeder Lambda-Ausdruck in Java basiert auf einem FunctionalInterface
        // Lambdas ist die Implementierung der abstrakten Methode eines FunctionalInterface


        // Xyz xyz = new Xyz(); // Error: Keine Instanzen von abstrakten Klassen

        // Anonyme Klasse
        // Eine Klasse ohne Namen wird deklariert
            // Sie erbt von Xyz
                // Sie wird sofort instanziert
                    // Kann auf konkreten und abstrakten Klassen, sowie Interfaces basieren

        Xyz xyz1 = new Xyz(){
            @Override
            void machWas() {
                System.out.println("AAAAAAAAA");
            }
        };

        Xyz xyz2 = new Xyz(){
            @Override
            void machWas() {
                System.out.println("BBBBBBBBB");
            }
        };

        xyz1.machWas();
        xyz2.machWas();

        // Lambda vs Anonyme Klasse: Lambdas nurzen eine Kurzschreibweise,
        // dafür basieren sie IMMER auf einem FunctionalInterface

        List<Integer> list = new ArrayList<>();
    }
}

// FunctionalInterface = SAM = Single Abstract Method

@FunctionalInterface
interface MathOp {
    // FunctionalInterface hat nur eine einzige abstrakte Methode
    // weitere statische und default Methoden sind erlaubt
    int execute(int a, int b);
}

abstract class Xyz {

    abstract void machWas();

}
