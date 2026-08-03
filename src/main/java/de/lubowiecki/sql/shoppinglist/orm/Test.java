package de.lubowiecki.sql.shoppinglist.orm;

public class Test {

    public static void main(String[] args) {

        try {
            Repository<Item> repo = new ItemRepository();

            if(repo.delete(2)) {
                System.out.println("gelöscht");
            }

            for(Item item : repo.findAll()) {
                System.out.println(item);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
