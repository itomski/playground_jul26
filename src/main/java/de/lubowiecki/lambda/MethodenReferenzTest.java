package de.lubowiecki.lambda;

import java.time.LocalDate;

public class MethodenReferenzTest {

    public static void main(String[] args) {

        FuncIn1 fn1 = i -> i * 5;
        FuncIn1 fn2 = MethodenReferenzTest::multi10; // Verweis auf eine Methode mit gleicher Signatur

        MethodenReferenzTest mrt = new MethodenReferenzTest();
        FuncIn1 fn3 = mrt::multi20; // Kann auch eine Instanzmethode sein

        System.out.println();

        FuncIn2 fn4 = d -> d.getYear();
        FuncIn2 fn5 = LocalDate::getYear; // LocalDate ist hier der Eingangsparameter

    }

    public static int multi10(int i) {
        return i * 10;
    }

    public int multi20(int i) {
        return i * 10;
    }
}

@FunctionalInterface
interface FuncIn1 {

    int compute(int i);
}

@FunctionalInterface
interface FuncIn2 {

    int compute(LocalDate ld);
}
