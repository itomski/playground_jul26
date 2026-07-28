package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group implements Movable {

    private List<Movable> elements;

    public Group() {
        elements = new ArrayList<>();
    }

    public Group(Movable... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(Movable... elements) {
        this.elements.addAll(Arrays.asList(elements));
    }

    @Override
    public void move(int x, int y) {
        for (Movable element : elements) {
            element.move(x, y); // Bewegung wird an jedes Element delegiert
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "elements=" + elements +
                '}';
    }
}
