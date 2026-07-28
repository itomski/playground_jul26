package de.lubowiecki.vererbung;

public class InstanceOfTest {

    public static void main(String[] args) {

        Object o = 10.15;
        //Object o = 10;

        // früher
//        if(o instanceof Double) {
//            Double d = (Double) o; // ClassCastException
//            System.out.println("Infinite: " + d.isInfinite());
//        }

        // jetzt
        if(o instanceof Double d) { // Wenn es ein Double ist, wird automatisch gecastet
            System.out.println("Infinite: " + d.isInfinite());
        }

        // istanceof prüft die IS-A Beziehung
    }
}
