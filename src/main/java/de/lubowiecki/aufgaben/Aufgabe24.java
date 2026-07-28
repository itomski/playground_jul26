package de.lubowiecki.aufgaben;

public class Aufgabe24 {

    /*
    Schreibe ein Klasse für einen Print-Server welcher Objekte verschiedener Klassen über eine print-Methode drucken kann.
    Das Drucken wird durch die Ausgabe auf der Konsole simuliert.

    Baue dazu ein Interface, welches dann von verschiednen Dokumentklassen (z.B. Word, Excel, Txt, PowerPoint) implementiert wird.
    Durch die Implementierung des Interface sollen die Dokument-Objekte mit der print-Methode des Print-Servers komplatibel sein.
     */

    public static void main(String[] args) {

        PrintServer server = new PrintServer();
        server.print(new WordDoc("Dies und das"), new WordDoc("Was anderes..."));
    }
}

class PrintServer {

    public void print(Printable printable) {
        System.out.println("Printing " + printable.getClass().getSimpleName() + ": " + printable.getContent());
    }

    public void print(Printable... printable) {
        for (Printable p : printable) {
            print(p);
        }
    }
}

interface Printable {
    String getContent();
}

class WordDoc implements Printable {

    private String content;

    public WordDoc(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
