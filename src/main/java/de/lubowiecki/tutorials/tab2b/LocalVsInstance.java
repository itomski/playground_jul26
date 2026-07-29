package de.lubowiecki.tutorials.tab2b;

public class LocalVsInstance {

    public static void main(String[] args) {

        Konto k = new Konto(); // Objekt

        k.setKontoNr(123456789);

        System.out.println(k.getKontoNr());

    }
}
