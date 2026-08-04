package de.lubowiecki.design;

// Top-Level-Klasse: Nur eine pro Datei darf public sein
public class InnerClasses {

    private int zahl = 100;
    private static int andereZahl = 200;

    public static void main(String[] args) {

        // Lokale Klasse
        class Local {

        }

        Local local = new Local(); // Instanzierung nur nach der Deklaration und nur innerhalb der Methode möglich

        // Instanzierung der inneren Klasse
        InnerClasses.Inner inner = new InnerClasses().new Inner();
        InnerClasses ic =  new InnerClasses();
        InnerClasses.Inner inner2 = ic.new Inner();

        // Instanzierung der statischen inneren Klasse
        InnerClasses.StaticInner inner3 = new InnerClasses.StaticInner();
        // Kein Objekt der äußeren Klasse notig

    }

    // Innere Klasse
    // Wird instanziert, braucht eine Instanz der äußeren Klasse
    private class Inner {

        private int ganzAndereZahl = 300; // Äußere Klasse hat keinen Zugriff

        void machWas() {
            System.out.println(zahl); // Hat Zugriff auf Instanz Eigenschaften und Instanz-Methoden der äußeren Klasse
            System.out.println(andereZahl); // Hat auch Zugriff auf statische Eigenschaften und Methoden der äußeren Klasse
        }
    }

    // Statische innere Klasse
    // Wird instanziert, braucht aber keine Instanz der äußeren Klasse
    static class StaticInner {

        void machWas() {
            System.out.println(andereZahl); // Hat Zugriff auf statische Eigenschaften und Methoden der äußeren Klasse
        }
    }
}
