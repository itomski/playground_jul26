package de.lubowiecki.vererbung;

public class InventarVererbung {

    public static void main(String[] args) {

//        Child c1 = new Child();
//        // c1.attr1 = "A"; // Error. In Child nicht verfügbar
//        c1.attr2 = "B";
//        c1.attr3 = "C";
//        c1.attr4 = "D";

        // Referenztyp: Parent
        // Objekttyp: Child
        Parent p1 = new Child(); // Child IS-A Parent
        Child c1 = new Child();
        // Referenztyp entscheidet, was sichtbar ist
        p1.machWas();
        // p1.machWasAnderes(); // Error: Über Parent Referenz nicht sichtbar

        // Statische Methoden und Attributen werden direkt auf dem Referenztyp ausgeführt
        System.out.println(p1.attr4);
        System.out.println(c1.attr4);

        System.out.println();

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        p1.machWas();
        c1.machWas();

        // Auf eine Referenz kann jedes Objekt abgelegt werden, welches in einer IS-A Beziehung dazu steht
        Parent p2 = new Parent();
        p2 = new Child();
        p2 = new NextChild();

    }
}

class Parent {

    private String attr1; // Privates Inventar wird NICHT vererbt
    String attr2; // Package Private Inventar wird nur an Klassen im gleichen Package vererbt
    protected String attr3; // Protected Inventar wird vererbt - nur eine erbende Klasse kann es benutzen
    public String attr4 = "A"; // Public kann ohne Einschränkung vererbt und aufgerufen werden

    public Parent() {
        System.out.println("Parent constructor");
    }

    public void machWas() {
        System.out.println("machWas: Parent");
    }
}

class Child extends Parent {

    // Hiding
    public String attr4 = "B";

    public Child() {
        super();
        System.out.println("Child constructor");
    }

    public void machWasAnderes() {
        System.out.println("machWasAnderes");
    }

    public void machWas() {
        System.out.println("machWas: Child");
    }
}

class NextChild extends Parent {

    // Hiding
    public String attr4 = "C";

    public NextChild() {
        super();
        System.out.println("Child constructor");
    }

    public void machWas() {
        System.out.println("machWas: NextChild");
    }
}
