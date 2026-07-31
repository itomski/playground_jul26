package de.lubowiecki.sql;

import java.sql.*;

public class ConnectionTest {

    public static void main(String[] args) {

        try {
            PersonRepository.createTable();

            // CRUD - Create Read Update Delete

            if(PersonRepository.insert("Carol", "Danvers")) System.out.println("gespeichert");

            if(PersonRepository.delete(1)) System.out.println("gelöscht");

            if(PersonRepository.update(2, "Bob", "Parker")) System.out.println("geändert");

            for(Person p : PersonRepository.findAll()) {
                System.out.println(p.getVorname() + " " + p.getNachname());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
