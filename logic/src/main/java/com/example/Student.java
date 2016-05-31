package com.example;

import java.util.ArrayList;

/**
 * Created by carlnielsen on 31/05/16.
 */
public class Student {
    public int id;
    public String name;
    public String sex;
    public int birthDate;
    public String university;
    public String faculty;
    public ArrayList<String> skills;
    public GPSLocation location;
    public String personalText;
    public ArrayList<Employer> listOfEmployers;

    public Student(int id,String name, String sex, int birthDate, String university, String faculty, ArrayList<String> skills,
                   GPSLocation location, String personalText) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.university = university;
        this.faculty = faculty;
        this.skills = skills;
        this.location = location;
        this.personalText = personalText;
        this.listOfEmployers = new ArrayList<Employer>();
    }


}
