package de.lubowiecki.vererbung;

public class AbstrakteKlassen {

    public static void main(String[] args) {

        // Instanzmethoden werden immer auf dem Objekttyp ausgeführt

        // Animal a = new Animal(); // Error!
        Animal a = new Dog(); // Ok
        a.setName("Bracky");
        a.getSound();

        System.out.println();
        a = new Cat(); // Ok
        a.setName("Pork");
        a.getSound();

        System.out.println();
        a = new Ape(); // Ok
        a.setName("Pizza");
        a.getSound();
        // a = "Moin"; // String IS-NOT Animal
    }
}

abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstrakte Methoden MÜSSEN in den Kindklassen implementiert werden
    public abstract void getSound();
}

class Dog extends Animal {

    @Override
    public void getSound() {
        System.out.println("Wau Wau!");
    }
}

class Cat extends Animal {

    @Override
    public void getSound() {
        System.out.println("Miau Miau!");
    }
}

class Ape extends Animal {

    @Override
    public void getSound() {
        System.out.println("Ugh Ugh!");
    }
}