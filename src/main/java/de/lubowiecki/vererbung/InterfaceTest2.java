package de.lubowiecki.vererbung;

public class InterfaceTest2 {

    public static void main(String[] args) {

        Steckdose dose1 = new Steckdose();

        Stecker stecker = new Lampe();

        // Überall wo das Interface als Typ verlangt wird, kann eine Objekt einer Klasse übergeben werden,
        // welches das Interface implementiert
        dose1.einstecken(stecker);
    }
}

class Steckdose {

    private Stecker verbraucher;

    public void einstecken(Stecker verbraucher) {
        this.verbraucher = verbraucher;
        verbraucher.getStrom();
    }
}

interface Stecker {

    void getStrom();

}

class Lampe implements Stecker {
    @Override
    public void getStrom() {
        System.out.println("Die Lampe leuchtet!");
    }
}

class Kaffeemaschine implements Stecker {
    @Override
    public void getStrom() {
        System.out.println("Die Maschine produziert Kaffee.");
    }
}

class Kuehlschrank implements Stecker {
    @Override
    public void getStrom() {
        System.out.println("Kühlt den Inhalt");
    }
}
