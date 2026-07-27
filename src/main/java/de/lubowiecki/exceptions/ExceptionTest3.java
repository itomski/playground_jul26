package de.lubowiecki.exceptions;

public class ExceptionTest3 {

    public static void main(String[] args) throws Exception {

//        Exception e = new Exception(); // Checked
//        RuntimeException re = new RuntimeException(); // Unchecked
//        throw e;
//        throw re;

        try {
            int i = 10;
            int j = 0;
            System.out.println(i / j); // ArithmeticException
        }
        catch(ArithmeticException e) {
            // ursprüngliche Exception wird als Grund für die neue verwendet
            throw new Exception("Dies und das", e); // Wechsel von Unchecked- auf Checked-Exception
        }

        System.out.println("Ende");
    }
}
