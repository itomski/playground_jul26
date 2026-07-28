package de.lubowiecki.patterns.composite;


public abstract class GeoShape implements Movable {

    private int x;
    private int y;

    public GeoShape() {
    }

    public GeoShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
