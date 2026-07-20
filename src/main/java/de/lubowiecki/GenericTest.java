package de.lubowiecki;

public class GenericTest {

    public static void main(String[] args) {

        StringBox sb = new StringBox("Das ist mein Text...");
        System.out.println(sb.get());

        DoubleBox db = new DoubleBox(1245.17);
        System.out.println(db.get());

        Box<String> box = new Box<>("Dies und Das");
        System.out.println(box.get());

        Box<Integer> box2 = new Box<>(123);
        System.out.println(box2.get());

        Box<Double> box3 = new Box<>(123.25);
        System.out.println(box3.get());

    }
}


class StringBox {

    private String text;

    public StringBox(String string) {
        this.text = string;
    }

    public String get() {
        return text;
    }
}

class DoubleBox {

    private double zahl;

    public DoubleBox(double zahl) {
        this.zahl = zahl;
    }

    public double get() {
        return zahl;
    }
}

class Box<T> {

    private T wert;

    public Box(T wert) {
        this.wert = wert;
    }

    public T get() {
        return wert;
    }
}