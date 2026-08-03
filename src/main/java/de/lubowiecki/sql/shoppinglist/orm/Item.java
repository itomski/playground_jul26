package de.lubowiecki.sql.shoppinglist.orm;

public class Item extends AbstractEntity {

    private String name;
    private int count;
    private String description;
    private boolean done;

    public Item(int id, String name, int count, String description, boolean done) {
        setId(id);
        this.name = name;
        this.count = count;
        this.description = description;
        this.done = done;
    }

    public Item(String name, int count, String description) {
        this.name = name;
        this.count = count;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
