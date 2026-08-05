package de.lubowiecki.aufgaben.loesungen.a34;

public class AbstractNavigable implements Navigable {

    protected int x;
    protected int y;

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
