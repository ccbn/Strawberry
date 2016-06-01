package com.example;

import java.util.ArrayList;
/**
 * Created by carlnielsen on 31/05/16.
 */

public class Student {
    private int id;
    private String name;
    private String sex;
    public int birthDate;
    public String university;
    public String faculty;
    public ArrayList<String> skills;
    public GPSLocation location;
    public String personalText;
    public ArrayList<Employer> listOfEmployers;

    public Student(String name, String sex, int birthDate, String university, String faculty, ArrayList<String> skills,
                   GPSLocation location, String personalText) {
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

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
