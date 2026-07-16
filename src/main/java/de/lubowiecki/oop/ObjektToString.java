package de.lubowiecki.oop;

public class ObjektToString {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Carol", "Danvers");

        // println konvertiert vor der Ausgabe Objekte in Strings.
        // Die passiert durch die toString-Methode
        System.out.println(p1); // Automatisch wird die toString-Methode auf dem Objekt aufgerufen
        System.out.println(p2);
    }
}

class Person {

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() { // Beschreibt die Konvertierung in einen String
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
