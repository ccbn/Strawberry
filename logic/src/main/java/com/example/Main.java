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
        String url = "jdbc:mysql://2.104.1.132:3306/strawberry";
        String user = "carl";
        String password = "cocacola";

        try {
            conn = DriverManager.getConnection(url,user,password);

            Statement stm = conn.createStatement();

            //stm.execute("INSERT INTO skills VALUES (NULL,'Python')");
            stm.execute("select * from Skills");

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
