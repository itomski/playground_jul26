package de.lubowiecki.sql.shoppinglist.orm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    // Create Read Update Delete

    Optional<T> find(int id) throws SQLException;

    List<T> findAll() throws SQLException;

    boolean insert(T t) throws SQLException;

    boolean update(T t) throws SQLException;

    boolean delete(T t) throws SQLException;

    boolean delete(int id) throws SQLException;

    T create(ResultSet result) throws SQLException;

    void createTable() throws SQLException;
}
