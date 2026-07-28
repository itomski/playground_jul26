package de.lubowiecki.patterns.composite;

public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }

    public Square(int x, int y, int length) {
        super(x, y, length, length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }
}
