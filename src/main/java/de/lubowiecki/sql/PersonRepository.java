package de.lubowiecki.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private static final String URL = "jdbc:sqlite:data.db";

    private static final String TABLE = "personen";

    public static boolean update(int id, String vorname, String nachname) throws SQLException {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            final String SQL = "UPDATE " + TABLE + " SET vorname = '" + vorname + "', nachname = '" + nachname + "' WHERE id = " + id;
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    public static boolean delete(int id) throws SQLException {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            return stmt.executeUpdate("DELETE FROM " + TABLE + " WHERE  id = " + id) == 1;
        }
    }

    public static List<Person> findAll() throws SQLException {

        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE);

            List<Person> list = new ArrayList<>();

            while(results.next()) {
                // Mapping von relationalen Daten zu Person-Objekten
                Person person = new Person(
                        results.getInt("id"),
                        results.getString("vorname"),
                        results.getString("nachname")
                );
                list.add(person);
            }
            return list;
        }
    }

    public static boolean insert(String vorname, String nachname) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) {

            final String SQL = "INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(NULL, '" + vorname + "', '" + nachname + "')";
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    public static void createTable() throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL);
            Statement stmt = connection.createStatement()) { // Verbindung aufbauen

            final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "vorname TEXT NOT NULL, " +
                    "nachname TEXT NOT NULL)";

            stmt.execute(SQL);
        }
    }
}
