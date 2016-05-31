package com.example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by carlnielsen on 31/05/16.
 */
public class Main {

    public static void main(String [] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db1?" +
                            "user=carl&password=user");

            Statement stm = conn.createStatement();

            //stm.execute("INSERT INTO skills VALUES (NULL,'Python')");
            stm.execute("SELECT * ");

            System.out.println("Connected to database");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }


    }
}
//hello world
//hello world 2
//hello world 3
