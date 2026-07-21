package de.lubowiecki.api;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // List
        List<String> strList = new ArrayList<>();
        strList.add("ABC");
        strList.addAll(List.of("CDE", "FEG", "GHI", "CDE")); // Mehrere Objekte hinzufügen
        System.out.println(strList);

        System.out.println();

        // Set(Menge)
        Set<String> strSet = new HashSet<>();
        strSet.add("ABC");
        strSet.addAll(List.of("CDE", "FEG", "GHI", "CDE"));
        strSet.add("CDX");
        System.out.println(strSet);

        System.out.println();

        // Queue
        Queue<String> strQueue = new LinkedList<>();
        strQueue.offer("ABC"); // Element wird hinzugefügt
        strQueue.offer("CDE");
        strQueue.offer("EFG");
        while (!strQueue.isEmpty()) {
            System.out.println(strQueue.poll()); // Elemente werden rausgeholt
        }

        System.out.println();

        Map<String, Integer> strMap = new HashMap<>();
        strMap.put("Hamburg", 1_900_000);
        strMap.put("Berlin", 2_400_000);
        strMap.put("München", 1_200_000);
        strMap.put("Kiel", 350_000);
        strMap.put("Münster", 550_000);

        System.out.println(strMap.get("Hamburg"));
        System.out.println(strMap.getOrDefault("Münster", 0));
    }
}
