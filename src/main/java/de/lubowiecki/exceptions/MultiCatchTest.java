package de.lubowiecki.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchTest {

    public static void main(String[] args) {

        try {
            machWas();
        }
        catch (ArithmeticException e) {
            System.out.println("Problem beim Rechnen");
        }
        catch (IOException | SQLException e) { // Keine Kind/Eltern-Beziehung zwischen den Exceptions erlaubt
            // In einem Multicatch ist das e final!
            System.out.println("Problem beim Zugriff auf eine Datenquelle");
        }
//        catch (SQLException e) {
//            System.out.println("Problem beim Zugriff auf eine Datenquelle");
//        }
        catch (Exception e) {
            System.out.println("Problem!");
        }

    }

    private static void machWas() throws SQLException, IOException {

        //throw new ArithmeticException();
        //throw new ArrayIndexOutOfBoundsException();
        //throw new IOException("Problem mit einer Datei"); // Checked
        throw new SQLException();
    }
}
