package de.lubowiecki.generics;

public class GenericTest {

    public static void main(String[] args) {
        Analyser<String> analyser = new Analyser();
        analyser.run("ABC");
        // analyser.run(123);
    }

}

class Analyser<T> {

    void run(T t) {
        System.out.println(t.getClass().getName());
    }

}