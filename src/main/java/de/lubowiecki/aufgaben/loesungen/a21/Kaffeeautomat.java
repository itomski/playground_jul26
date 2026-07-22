package de.lubowiecki.aufgaben.loesungen.a21;

public class Kaffeeautomat {

    private int kaffee;
    private int milch;
    private int wasser;

    public Kaffeeautomat() {
        this.kaffee = 200;
        this.milch = 500;
        this.wasser = 1000;
    }

    public boolean zubereiten(Kaffeeprodukt produkt) {
        return switch(produkt) {
            case ESPRESSO -> zubereiten(10, 30, 0);
            case CAPPUCCINO -> zubereiten(18, 60, 60);
            case AMERICANO -> zubereiten(10, 120, 0);
            case LATE_MACCHIATO -> zubereiten(18, 40, 80);
        };
    }

    private boolean zubereiten(int kaffee, int milch, int wasser) {
        // Prüfen
        if(this.kaffee - kaffee <= 0) throw new ZuWenigKaffeeException();
        if(this.milch - milch <= 0) throw new ZuWenigMilchException();
        if(this.wasser - wasser <= 0) throw new ZuWenigWasserException();
        // Bestand reduzieren
        this.kaffee -= kaffee;
        this.milch -= milch;
        this.wasser -= wasser;
        return true;
    }
}
