package de.lubowiecki.oop;

public class KonstruktorTest {

    public static void main(String[] args) {

        KTest kt1 = new KTest("Bla bla bla", 100);
        // kt1.text = "..."; // Kein direkter Zugriff möglich, da private
        // kt1.zahl = -100; // Kein direkter Zugriff möglich, da private
        // System.out.println(kt1.text); // Kein direkter Zugriff möglich, da private
        System.out.println(kt1.getText()); // Aufruf des Getters
        kt1.setText("Neuer Text..."); // Aufruf des Setters
        System.out.println(kt1.getText());

        KTest kt2 = new KTest("Bla bla bla");
        KTest kt3 = new KTest(100);
        KTest kt4 = new KTest();

        kt1 = null;
        kt2 = null;
        kt3 = null;

        System.gc();
    }
}

class KTest {

    // Default-Konstruktor (parameterlos) wird automatisch bereitgestellt, solange kein eingener definiert ist

    // Wenn kein Access-Modifier vor einer Variable, Methode oder Klasse steht, ist diese package-private
    // Ausnahme: Im Interface sind alle Variablen und Methoden public
    private String text;
    private int zahl;

    public KTest(String text, int zahl) {
        // super(); // wird automatisch aufgerufen

        // this.text = Instanzvariable
        // text = Lokale Variable
        this.text = text;
        this.zahl = zahl;
    }

    public KTest(String text) {
        this.text = text;
    }

    public KTest(int zahl) {
        this.zahl = zahl;
    }

    public KTest() {
        this("Unbekannt", -1); // Aufruf eines anderen Konstruktors der gleichen Klasse
    }

    // Lesender Zugriff
    // private String text;
    public String getText() {
        return text.toUpperCase();
    }

    // Schreibender Zugriff
    public void setText(String text) {
        this.text = text;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHRRR!!!!!!!!");
    }
}