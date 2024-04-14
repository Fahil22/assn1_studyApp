package com.example.assienment1;

import java.util.ArrayList;
import java.util.List;

public class level {
    public String name;
    public List<course> courses;


    private level(String name, List<course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}
