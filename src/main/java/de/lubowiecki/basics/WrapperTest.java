package de.lubowiecki.basics;

public class WrapperTest {

    public static void main(String[] args) {

        // Für jeden primitiven Datentyp gibt es einen komplexen Wrappertyp
        // boolean -> Boolean
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // char -> Character
        // long -> Long
        // float -> Float
        // double -> Double

        // Autoboxing = Verpackt einen primitiven Datentyp beim Bedarf automatisch in seinen Wrappertyp
        Long l1 = 100L;

        // Autounboxing = Der Wrappertyp wird beim Bedarf automatisch zu einem primitiven ausgepackt
        long l2 = l1;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int i = Integer.parseInt("100");
        System.out.println(i);

        Integer j = Integer.valueOf(100);

        // Zum Rechnen werden Wrappertypen IMMER ausgepackt
        System.out.println(i + j);

        long l3 = j.longValue(); // Konvertiert Integer zu long
    }
}
