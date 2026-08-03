package de.lubowiecki.sql;

import de.lubowiecki.shopping.orm.Item;
import de.lubowiecki.shopping.orm.ItemRepository;

public class Test {

    public static void main(String[] args) {

        try {
            ItemRepository repo = new ItemRepository();
            for(Item item : repo.findAll()) {
                System.out.println(item);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
