package de.lubowiecki.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {

        try {
            checkAlter(11);
        }
        catch (AlterNegativException e) {
            System.out.println("negativ");
        }
        catch (ZuJungException e) {
            System.out.println("jung");
        }
        catch (ZuAltException e) {
            System.out.println("alt");
        }
        catch (IllegalArgumentException e) {
            System.out.println("rest");
        }
    }

    private static void checkAlter(int alter) throws IllegalArgumentException {

        if(alter <= 0) {
            throw new AlterNegativException();
        }
        else if (alter < 12) {
            throw new ZuJungException();
        }
        else if (alter > 100) {
            throw new ZuAltException();
        }
        else {
            System.out.println("alter is ok");
        }
    }
}

class AlterNegativException extends IllegalArgumentException {
}

class ZuJungException extends IllegalArgumentException {
}

class ZuAltException extends IllegalArgumentException {
}
