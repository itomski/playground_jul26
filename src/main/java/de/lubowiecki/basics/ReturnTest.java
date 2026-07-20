package de.lubowiecki.basics;

public class ReturnTest {

    public static void main(String[] args) {

        machWas(); // main ist static, daher können nur statische Methoden direkt aufgerufen werden

        ReturnTest rt = new ReturnTest();
        rt.machWasAnderes(); // Instanzmethoden MÜSSEN auf der Instanz aufgerufen werden

    }

    public static void machWas() {
        System.out.println("machWas");
    }

    public void machWasAnderes() {
        System.out.println("machWasAnderes");
    }

    public static int machWasGanzAnderes1() {
        // definiert eine Methode einen Rückgabetyp (nicht void), MUSS ein passender Wert zurückgegeben werden
        return 10; // return verlässt die Methode
        // System.out.println("Ausgabe"); // Error: Statement nicht mehr erreichbar
    }

    public static int machWasGanzAnderes2() {
        // Wird kein Wert zurückgegeben MUSS eine Exception geworfen werden
        throw new RuntimeException("..."); // geworfene Exception verlässt die Methode
        // System.out.println("Ausgabe"); // Error: Statement nicht mehr erreichbar
    }

    public static void printArray(int[] arr) {
        if(arr.length == 0) {
            System.out.println("empty");
            return; // Verlässt vorzeitig die Methode
            // Bei Rückgabetyp void bekommt das return keinen Wert und ist optional
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
