package de.lubowiecki.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        // Eine Gruppe von Elementen so eifach wie ein einzelnes Objekt zu bedienen

        Movable m1 = new Circle(100);
        Movable m2 = new Rectangle(20, 250);
        Movable m3 = new Square(50);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println();
        m1.move(20,25);
        m2.move(120,72);
        m3.move(20,75);
        // m1 als Referenz bietet Zugriff nur auf die Methoden von Movable

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println();
        Group group1 = new Group(m1, m2, m3);
        group1.move(80,32);
        System.out.println(group1);

        Group group2 = new Group(group1, new Square(15), new Circle(100));
        group2.move(0,0);

        System.out.println();
        System.out.println(group2);
    }
}
