package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class DatabaseTest {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Ravi/test java.db");
            Statement statement = con.createStatement();
            statement.execute("create table contactss('name text','email text')");

            statement.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }
}

