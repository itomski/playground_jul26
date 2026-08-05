package de.lubowiecki.aufgaben.loesungen.a34;

public enum Direction {

    RIGHT, BOTTOM, LEFT, TOP;

    static Direction getByString(String s) {
        return switch (s.toLowerCase()) {
            case "r" -> RIGHT;
            case "l" -> LEFT;
            case "t" -> TOP;
            case "b" -> BOTTOM;
            default -> null;
        };
    }
}
