package com.example;

import com.mysql.jdbc.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseManager {

    Connection conn;
    String url = "jdbc:mysql://2.104.1.132:3306/strawberry";
    String user = "carl";
    String password = "cocacola";

    public DatabaseManager() {
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public ArrayList<HashMap<String,Object>> getStudentsWithColumnNames() {

        try {
            Statement stm = conn.createStatement();
            ResultSet students = stm.executeQuery("select * from students");
            ResultSetMetaData metaData = (ResultSetMetaData) students.getMetaData();
            ArrayList<String> listOfMetaDataOfStudents = new ArrayList<String>();
            ArrayList<HashMap<String,Object>> listOfStudents = new ArrayList<HashMap<String, Object>>();

            if(students != null) {
                while(students.next()) {
                    HashMap<String,Object> student = new HashMap<String,Object>();
                    for(String nameOfColumn: listOfMetaDataOfStudents) {
                        student.put(nameOfColumn, students.getObject(nameOfColumn));
                    }
                    listOfStudents.add(student);
                }
            }
            return listOfStudents;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        
    }
}
