package de.lubowiecki.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) throws IOException {

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Natasha");

        // Externe Iteraton
        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Interne Iteration
        namen.stream().forEach(System.out::println);

        System.out.println();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println();

        DoubleStream.of(10.5, 13.22, 19.0, 17, -10.5)
                .forEach(System.out::println);

        System.out.println();

        Files.lines(Paths.get("text1.txt"))
                .forEach(System.out::println);

        System.out.println();

        Random randGen = new Random();
        IntSupplier random = () -> randGen.nextInt(100);

        IntStream.generate(random)
                .limit(100)
                .forEach(System.out::println);

    }
}
