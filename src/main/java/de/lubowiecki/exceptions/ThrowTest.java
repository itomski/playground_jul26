package de.lubowiecki.exceptions;

public class ThrowTest {

    public static void main(String[] args) {

        try {
            System.out.println(check(62));
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    // bei unchecked Exceptions ist das throws optional
    static String check(int alter) throws IllegalArgumentException {

        if(alter < 10) {
            return "ok";
        }
        else if(alter < 20) {
            return "top";
        }
        else if(alter < 50) {
            throw new IllegalArgumentException("Alter ist bisschen zu hoch");
        }
        else {
            throw new IllegalArgumentException("Alter ist eindeutig zu hoch");
        }
    }
}
