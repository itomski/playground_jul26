package de.lubowiecki.basics;

public class Scopes {

    // Klassenvariablen: Ab dem Laden der Klasse bis zum Ende des Programms sichtbar
    static int i;

    // Instanzvariablen: Nur über das Objekt erreichbar und nur so lange, wie das Objekt referenziert ist
    int j;

    void machWas() {
        // Lokale Variable: Nur während der Methodenausführung verfügbar
        int k;

        if(true) {
            int a; // Lokale Variable im Sub-Block: Nur bis zum Ende des Blocks verfügbar
        }
        // a ist hier out-of-scope und kann neu deklariert werden

        {
            int b; // Lokale Variable im Sub-Block: Nur bis zum Ende des Blocks verfügbar
        }
        // b ist hier out-of-scope und kann neu deklariert werden

        for (int l = 0; l < 10; l++) {
        }
        // l ist hier out-of-scope und kann neu deklariert werden

        for (int l = 0; l < 20; l++) {
        }

        // Eine bereits vorhandene lokale Variable kann nicht im gleichen Scope redeklariert werden

        // Klassen und Instanzvarieblen können durch lokale Varaiablen überlagert werden (Shadowing)
        int j = 100; // Überlagert die Instanzvaribel
        // j = lokale Variable
        // this.j = Instanzvariable

        int i = 200; // Überlagert die Klassenvariable
        // i = lokale Variable
        // Scopes.i = Klassenvariable (Klassenname wird vorangestellt)

        if(i == 100) {
            String text = "Moin!";
        } // text ist hier out-of-scope

        //System.out.println(text); // Error: Nicht mehr verfügbar


        String text; // Deklaration - Scope ist die Methode
        if(i == 100) {
            text = "Moin!"; // Initialisierung
        } else {
            text = "Hallo"; // Initialisierung
        }
        System.out.println(text);


        switch(i) {
            case 10:
                System.out.println("A");
                int v = 100;
                {
                    int x = 20; // Nur auf diesen Block beschränkt
                }
                break;

            case 20:
                System.out.println("B");
                v = 200; // v darf nicht neu deklariert werden
                {
                    int x = 30; // Redeklaration möglich
                }
                break;

            case 30:
                System.out.println("C");
                v = 300;
                break;

            default:
                System.out.println("X");
                v = 400;
        }

        //System.out.println(v); // Error: v ist out-of-scope
    }
}
