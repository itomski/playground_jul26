package de.lubowiecki.sql.shoppinglist.orm;

import de.lubowiecki.sql.DBUtils;
import de.lubowiecki.sql.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class ItemRepository extends AbstractRepository<Item> {

    public ItemRepository() throws SQLException {
        super("items");
        createTable();
    }

    @Override
    public boolean insert(Item item) throws SQLException {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Item item) throws SQLException {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Item create(ResultSet result) throws SQLException {
        Item item = new Item(
                result.getInt("id"),
                result.getString("name"),
                result.getInt("count"),
                result.getString("description"),
                result.getBoolean("done")
        );
        return item;
    }

    @Override
    public void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "count INTEGER NOT NULL, " +
                "description TEXT NOT NULL, " +
                "done BOOLEAN NOT NULL)";

        executeQuery(SQL);
    }
}
