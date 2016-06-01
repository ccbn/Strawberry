package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {



    public static void main(String [] args) {
        DatabaseManager dm = new DatabaseManager();
        ArrayList<HashMap<String, Object>> studentsWithColumnNames = dm.getStudentsWithColumnNames();
        System.out.println(studentsWithColumnNames.size());
        ArrayList<String> listOfSkills = new ArrayList<String>();
        listOfSkills.add("Java");
        listOfSkills.add("C++");
        GPSLocation location = new GPSLocation(1,2);
        Student student = new Student("Carl Nielsen","Male", 5,"DTU", "Computer", listOfSkills, location, "Text");


    }
}
