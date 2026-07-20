package de.lubowiecki.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {


        // Singleton: Sichert zu, dass es zu jedem Zeitpunkt nur ein einziges Objekt des Singletons gibt

        EagerSingleton singleton1 = EagerSingleton.getInstance();
        singleton1.addToZahl(1);

        EagerSingleton singleton2 = EagerSingleton.getInstance();
        singleton2.addToZahl(1);

        EagerSingleton.getInstance().addToZahl(1);

        machWas();

        System.out.println(singleton1.getZahl());

        System.out.println();

        LazySigleton singleton3 = LazySigleton.getInstance();
        singleton3.addToZahl(1);

        LazySigleton singleton4 = LazySigleton.getInstance();
        singleton4.addToZahl(1);

        LazySigleton.getInstance().addToZahl(1);

        machWasAnderes();

        System.out.println(singleton4.getZahl());

    }

    static void  machWas() {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.addToZahl(1);
    }

    static void  machWasAnderes() {
        LazySigleton singleton = LazySigleton.getInstance();
        singleton.addToZahl(1);
    }
}
