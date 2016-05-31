package com.example;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by carlnielsen on 31/05/16.
 */
public class Main {

    public static void main(String [] args) {
        DatabaseManager dm = new DatabaseManager();
        ArrayList<HashMap<String, Object>> studentsWithColumnNames = dm.getStudentsWithColumnNames();
        System.out.println(studentsWithColumnNames.size());
    }
}
//hello world
//hello world 2
//hello world 3
