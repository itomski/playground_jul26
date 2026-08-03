package de.lubowiecki.sql.shoppinglist.orm;

import de.lubowiecki.sql.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Der generische Typ T MUSS eine Kindklasse von AbstractEntity sein
public abstract class AbstractRepository<T extends AbstractEntity> implements Repository<T> {

    protected final String TABLE;

    protected AbstractRepository(String TABLE) {
        this.TABLE = TABLE;
    }

    @Override
    public List<T> findAll() throws SQLException {

        try(Connection connection = DBUtils.getConnection();
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE);

            List<T> list = new ArrayList<>();

            while(results.next()) {
                list.add(create(results));
            }
            return list;
        }
    }

    @Override
    public Optional<T> find(int id) throws SQLException {

        try(Connection connection = DBUtils.getConnection();
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE id = " + id);

            if(results.next()) {
                return Optional.of(create(results));
            }
            return Optional.empty();
        }
    }

    @Override
    public boolean delete(T t) throws SQLException {
        return delete(t.getId());
    }

    @Override
    public boolean delete(int id) throws SQLException {
        try(Connection connection = DBUtils.getConnection(); Statement stmt = connection.createStatement()) {
            stmt.execute("DELETE FROM " + TABLE + " WHERE id = " + id);
            return stmt.getUpdateCount() > 0;
        }
    }

    protected boolean executeQuery(final String SQL) throws SQLException {
        try(Connection connection = DBUtils.getConnection(); Statement stmt = connection.createStatement()) {
            return stmt.execute(SQL);
        }
    }
}
