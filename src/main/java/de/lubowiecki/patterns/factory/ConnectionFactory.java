package de.lubowiecki.patterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(ConnectionType type) throws SQLException {

        String URL = null;

        switch (type) {
            case MYSQL -> URL = "Connecting to mysql database...";
            case SQLITE -> URL = "Connecting to sqlite database...";
            case KAFKA -> URL = "Connecting to kafka database...";
            case MSSQL -> URL = "Connecting to mssql database...";
            case ORACLE -> URL = "Connecting to oracle database...";
            default -> throw new SQLException("Unknown connection type");
        }
        return DriverManager.getConnection(URL);
    }
}
