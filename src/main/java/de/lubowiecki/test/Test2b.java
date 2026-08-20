package de.lubowiecki.test;

public class Test2b {

    public static void main(String[] args) {

        C1 c1 = new C1();
        C1 c2 = new C1();
        System.out.println(c1.equals(c2));

        System.out.println();
        C2 c3 = new C2();
        C2 c4 = new C2();
        System.out.println(c3.equals(c4));

        long l = 012l;

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Zum Rechnen werden alle Wrapper ausgepackt
        // kleinere Typen promovieren zum größeren mit. int

        // byte < short < int < long < float < double
        //         char <

        StringBuilder sb = new StringBuilder();
        sb.append(new char[]{'A','B', 'C'}, 0, 2);
        System.out.println(sb);
    }
}

class C1 {

    @Override
    public boolean equals(Object obj) {
        System.out.println("C1");
        return true;
    }
}

interface I1 {
    boolean equals(Object obj);
}

class C2 extends C1 implements I1 {

}
