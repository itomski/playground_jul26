package de.lubowiecki.aufgaben.loesungen.a34;

import java.util.Arrays;

public class GameBoard implements Board {

    private final String[][] board;

    public GameBoard(int rows, int cols) {
        board = new String[rows][cols];
        reset();
    }

    public void print() {
        for(String[] row: board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean set(Navigable element) {
        try {
            board[element.getX()][element.getY()] = element.toString();
            return true;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private void reset() {
        for (String[] row: board) {
            Arrays.fill(row, "X ");
        }
    }
}
