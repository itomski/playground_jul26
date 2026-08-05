package de.lubowiecki.aufgaben.loesungen.a34;

public class Robot extends AbstractNavigable {

    private Board board;

    private String sign;

    public Robot(String sign) {
        this.sign = sign;
    }

    public Robot(String sign, int x, int y) {
        this(sign);
        this.x = x;
        this.y = y;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean move(String steps) {
        if(board == null) throw new MoveNotPossible("Kein Spielfeld vorhanden!");

        String[] stepArr = steps.split("");
        for (String step : stepArr) {
            Direction direction = Direction.getByString(step);

            if(direction == null) continue;

            if(!move(Direction.getByString(step))) {
                throw new MoveNotPossible("Dieser Schritt kann nicht ausgeführt werden");
            }
        }
        return true;
    }

    private boolean move(Direction dir) {
        switch(dir) {
            case RIGHT ->  y++;
            case LEFT -> y--;
            case TOP -> x--;
            case BOTTOM -> x++;
        }

        return board.set(this);
    }

    @Override
    public String toString() {
        return sign;
    }
}
