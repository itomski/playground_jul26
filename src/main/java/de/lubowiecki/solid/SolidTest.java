package de.lubowiecki.solid;

public class SolidTest {

    public static void main(String[] args) {

        AC ac = new AC();
        ac.doSomething();

        BC bc = new BC();
        bc.doSomething();

        // BC ist ein SubTyp von AC
        // Alles was auf einem AC-Objekt aufgerufen werden kann, kann auch auf BC-Objekt aufgerufen werden

        System.out.println(check(ac));
        System.out.println(check(bc));
    }

    static boolean check(AC a) {
        return true;
    }
}

class AC {

    void doSomething() {
        System.out.println("doSomething AC");
    }
}

class BC extends AC {

    void doSomething() {
        System.out.println("doSomething BC");
    }
}