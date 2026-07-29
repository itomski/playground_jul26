package de.lubowiecki.time;

import java.time.Duration;
import java.time.Instant;

public class LaufzeitMessen {

    public static void main(String[] args) {

        long start =  System.currentTimeMillis();
        run();
        long ende =  System.currentTimeMillis();
        System.out.println(ende - start + "ms");

        System.out.println("------------");

        Instant instStart = Instant.now();
        run();
        Instant instEnde = Instant.now();
        Duration duration = Duration.between(instStart, instEnde);
        System.out.println(duration);
        System.out.println(duration.toNanos() + "n");
    }

    private static void run() {
        int[] arr = new int[1_000_000_000];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
}
