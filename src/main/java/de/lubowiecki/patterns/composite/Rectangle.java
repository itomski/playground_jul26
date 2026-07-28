package de.lubowiecki.patterns.composite;

public class Rectangle extends GeoShape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
