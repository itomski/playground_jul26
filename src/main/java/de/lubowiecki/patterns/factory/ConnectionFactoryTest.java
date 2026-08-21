package de.lubowiecki.patterns.factory;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryTest {

    public static void main(String[] args) {
        try {
            Connection conn = ConnectionFactory.getConnection(ConnectionType.MSSQL);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
