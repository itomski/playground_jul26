package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class BotTest {

    public static void main(String[] args) {

        Bot b1 = new Bot("R2-D2", "Astromechdroide");
        Bot b2 = new Bot("C3-PO", "Protokolldroide");

        System.out.println(b1.getBezeichnung());
        System.out.println(b1.getTyp());

        System.out.println();

        System.out.println(b2.getBezeichnung());
        System.out.println(b2.getTyp());

        System.out.println();
        Protokolldroide pd = new Protokolldroide("H-3PO");
        System.out.println(pd.getBezeichnung());
        System.out.println(pd.getTyp());

        System.out.println();
        Astromechdroide am = new Astromechdroide("R5-D4");
        System.out.println(am.getBezeichnung());
        System.out.println(am.getTyp());

        System.out.println();
        Bot b3 = pd;
        System.out.println(b3.getBezeichnung());
        System.out.println(b3.getTyp());

        List<Bot> droids = new ArrayList<>();
        droids.add(pd);
        droids.add(b1);
        droids.add(b2);
        droids.add(b3);
        droids.add(am);

        System.out.println("----------------");
        for (Bot bot : droids) {
            System.out.println(bot.getBezeichnung());
            System.out.println(bot.getTyp());
            bot.machDeinenJob(); // Methode wird auf dem Objekttyp ausgeführt
        }
    }
}

class Bot {

    // Privates Inventar wird NICHT vererbt
    private String bezeichnung;
    private String typ;

    public Bot(String bezeichnung, String typ) {
        this.bezeichnung = bezeichnung;
        this.typ = typ;
    }

    // Getter und Setter werden vererbt
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void machDeinenJob() {
        System.out.println(bezeichnung + ": erledigt seinen Job");
    }
}

class Protokolldroide extends Bot {

    public Protokolldroide(String bezeichnung) {
        super(bezeichnung, "Protokolldroide");
    }

    @Override // Prüft, ob in der Elternklasse eine Methode mit gleicher Signatur vorhanden ist, die ersetzt wird
    public void machDeinenJob() {
        System.out.println(getBezeichnung() + ": protokolliert / übersetzt");
    }
}

class Astromechdroide extends Bot {

    public Astromechdroide(String bezeichnung) {
        super(bezeichnung, "Astromechdroide");
    }

    @Override
    public void machDeinenJob() {
        System.out.println(getBezeichnung() + ": konstruiert");
    }
}