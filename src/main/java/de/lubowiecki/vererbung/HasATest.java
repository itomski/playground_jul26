package de.lubowiecki.vererbung;

public class HasATest {

    public static void main(String[] args) {

        Autor autor = new Autor("Philip K.", "Dick");
        Buch buch = new Buch(autor, "Bladerunner");

        System.out.println(buch.getAutor().getVorname());

        System.out.println();
        System.out.println(buch);
    }
}

class Buch {

    // HAS-A Beziehung
    private Autor autor;

    private String titel;

    public Buch(Autor autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "autor=" + autor +
                ", titel='" + titel + '\'' +
                '}';
    }
}

class Autor {

    private String vorname;
    private String nachname;

    public Autor(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}