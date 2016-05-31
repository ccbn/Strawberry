package com.example;

import java.util.ArrayList;

public class Employer {

    public String name;
    public String jobTitle;
    public GPSLocation location;
    public String jobDescription;
    public ArrayList<String> skills;
    public String typeOfJob;
    public String webpage;
    public ArrayList<Student> listOfStudents;

    public Employer(String name, String jobTitle, GPSLocation location, String jobDescription, ArrayList<String> skills,
                    String typeOfJob, String webpage) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.location = location;
        this.jobDescription = jobDescription;
        this.skills = skills;
        this.typeOfJob = typeOfJob;
        this.webpage = webpage;
        this.listOfStudents = new ArrayList<Student>();
    }
}