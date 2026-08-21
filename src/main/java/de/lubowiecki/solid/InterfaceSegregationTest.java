package de.lubowiecki.solid;

public class InterfaceSegregationTest {

    public static void main(String[] args) {

        Notebook notebook = new Notebook("#ABC");
        System.out.println(checkText(notebook));
        changeText(notebook, "Bla bla bla");

    }

    static boolean checkText(Readable book) {
        String str = book.read();
        if (str.startsWith("#")) {
            return true;
        }
        return false;
    }

    static void changeText(Writable book, String text) {
        String str = '#' + text + '#';
        book.write(str);
    }
}

interface Book extends Readable, Writable {
}

interface Readable {
    String read();
}

interface Writable {
    void write(String text);
}


class Notebook implements Readable, Writable {
    private String content;

    public Notebook() {
    }

    public Notebook(String content) {
        this.content = content;
    }

    public String read() {
        return content;
    }

    public void write(String content) {
        this.content += content;
    }
}

class Newspaper implements Readable {

    private final String content;

    public Newspaper(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }
}