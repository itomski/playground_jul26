package de.lubowiecki.basics;

public class LogischeOperatoren {

    public static void main(String[] args) {

        int alter = 25;

        // logisch

        if(alter > 15 && alter < 100) { // beides müssen true ergeben

        }

        if(alter > 0 || alter >= 100) { // eines oder beide müssen true ergeben

        }

        // bitwise

        if(alter > 15 & alter < 100) { // beides müssen true ergeben

        }

        if(alter > 0 | alter >= 100) { // eines oder beide müssen true ergeben

        }

        if(alter > 0 ^ alter >= 100) { // nur eines der beiden darf true ergeben

        }

        String text = null;

        // System.out.println(text.toLowerCase()); // NullPointerException: Referenz zeigt ins Leere

        if(text != null && text.trim().length() > 2) { // short-circuit
            System.out.println("Passt");
        }

        if(text != null & text.trim().length() > 2) { // kein short-circuit
            System.out.println("Passt");
        }


    }
}
