package de.lubowiecki.exceptions;

public class EigeneExceptionTest {

    public static void main(String[] args) throws MyException {

        // throw new MyException();
        throw new MyException("Dies und das...");

    }
}

class MyException extends Exception {

    public MyException() {
        super("Das ist eine Exception aus eigener Produktion");
    }

    public MyException(String message) {
        super(message);
    }
}