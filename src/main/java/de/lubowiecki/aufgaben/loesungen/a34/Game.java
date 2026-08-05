package de.lubowiecki.aufgaben.loesungen.a34;

public class Game {

    public static void main(String[] args) {

        final String b1Sign = "\uD83E\uDD16";
        final String b2Sign = "\uD83D\uDE00";

        GameBoard board = new GameBoard(10, 10);
        board.print();

        Robot bot1 = new Robot(b1Sign);
        bot1.setBoard(board);

        Robot bot2 = new Robot(b2Sign, 5, 5);
        bot2.setBoard(board);

        bot1.move("rrrbbblt");
        board.print();

        bot2.move("rrr");
        board.print();
    }
}
