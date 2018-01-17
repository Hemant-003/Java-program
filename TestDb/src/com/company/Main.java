package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class Main {


    public static final String DB_NAME = "test.db";
    public static final String CONNECTION_STRING = ("jdbc:sqlite:C:\\users\\heman\\" + DB_NAME);

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\users\\heman\\test.db");
            Statement statement = con.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                   COLUMN_EMAIL + " text " + ")");
            InsertContacts(statement,"SHYAM",74665,"shyam@gmail.com");
            InsertContacts(statement,"RAM",74445,"ram@gmail.com");
            InsertContacts(statement,"KISHAN",57665,"kishan@gmail.com");
            InsertContacts(statement,"RAMESH",7665,"ramesh@gmail.com");



            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " ( " +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + "," +
                    COLUMN_EMAIL + " ) "
                    +
                    "VALUES('HEMANT',74055,'HEMANT@GMAIL.COM')");


            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " ( " +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + "," +
                    COLUMN_EMAIL + " ) "
                    +
                    "VALUES('RAVI',74054,'RAVI@GMAIL.COM')");


            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " ( " +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + "," +
                    COLUMN_EMAIL + " ) "
                    +
                    "VALUES('BHAVNA',8200,'BHAVNA@GMAIL.COM')");

            con.setAutoCommit(false);
            con.commit();

            ResultSet rs = statement.executeQuery("SELECT * FROM contacts");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " +
                        rs.getInt("phone") + " " +
                        rs.getString("email") + " "
                );
            }

//            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + "=12345" + " WHERE " + COLUMN_NAME + "='HEMANT'");

//          statement.execute("SELECT * FROM contacts");
//          ResultSet rs = statement.getResultSet();



//          statement.execute("Insert INTO contacts(name,phone,email)"    +
//                  "VALUES('RAVI',740548,'ravi@gmail.com')");
////          statement.execute("UPDATE contacts set phone=12345 WHERE name = 'HEMANT' ");
//          statement.execute("DELETE FROM contacts WHERE name = 'TIM' ");

            statement.close();
            con.close();


        } catch (Exception e) {
            System.out.println("Exception caught " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void InsertContacts(Statement statement, String name, Integer phone, String email) throws SQLException {

        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " ( " +
                COLUMN_NAME + ", " +
                COLUMN_PHONE + "," +
                COLUMN_EMAIL + " ) "
                +
                "VALUES('" + name + "' , '" + phone + "' , '" + email + "' )");

    }
}
