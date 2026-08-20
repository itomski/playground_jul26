package de.lubowiecki.test;

public class Test3 {

    public static void main(String[] args) {

        int i = 10;
        int ii = -10;
        int j = 3;
        int jj = -3;
        System.out.println(i % j); // 1
        System.out.println(i % jj); // 1

        System.out.println();
        System.out.println(ii % j); // -1
        System.out.println(ii % jj); // -1

        System.out.println();

        double d = 10.0;
        double dd = -10.0;
        double c = 0.0;
        System.out.println(d / c); // Infinity
        System.out.println(dd / c); // -Infinity
        System.out.println(c / c); // NaN

        if(true) System.out.println("Moin");

        if(true)
            System.out.println("Moin1");
        else
            System.out.println("Moin2");

        System.out.println();

        int a = 3;
        int b = 4;
        System.out.println(a++ + ++b);
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        a = 3;
        b = 4;
        a = ++b + a++; // Durch Neuzuweisung geht das Postfix für die Variable verloren
        System.out.println(a);
        System.out.println(b);
        System.out.println(a);

        Object o = "Moin"; // Upcasting
        String s = (String)o; // Downcast

        int x;
        if(a == 3)
            x = 1;
        else
            x = 2;

        System.out.println(x);

        StringBuilder sb = new StringBuilder("Moin");
        // sb.toCharArray(); // Bei StringBuilder NICHT vorhanden
        // sb.trim(); // Bei StringBuilder NICHT vorhanden

        String s2 = "Hallo Welt";
        s2.toCharArray(); // Bei String vorhanden
        s2.trim(); // Bei String vorhanden

        String[] arr = {"Peter", "Bruce", "Carol"};
        String nameList = String.join(", ", arr); // Seit Java 9
        System.out.println(nameList);
    }
}
