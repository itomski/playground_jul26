package de.lubowiecki.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateTest {

    public static void main(String[] args) {

        IntStream.range(0, 100)
                .peek(i -> System.out.print("#" + i))
                .map(i -> i * 5)
                .filter(i -> i > 50)
                .filter(i -> i < 300)
                .forEach(System.out::println);

        System.out.println();

        int sum = IntStream.range(1, 21)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        System.out.println();

        List<Integer> zahlen = IntStream.range(1, 21)
                .filter(i -> i % 2 == 0)
                .collect(ArrayList::new, List::add, List::addAll);

        System.out.println(zahlen);
        System.out.println();

        List<String> namen = Stream.of("Peter", "Bruce", "Carol", "Natasha")
                                .collect(Collectors.toList());

        System.out.println(namen);
    }
}
