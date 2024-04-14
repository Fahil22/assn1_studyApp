package com.example.assienment1;


import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class data {

    private List<course> level1 = new ArrayList<course>();
    private List<course> level2 = new ArrayList<course>();
    private List<course> level3 = new ArrayList<course>();


    private List<subject> subject1 = new ArrayList<subject>();
    private List<subject> subject2 = new ArrayList<subject>();
    private List<subject> subject3 = new ArrayList<subject>();

//    private subject subject2 = new subject("Taylor Series");
//    private subject subject3 = new subject("introduction to A*");


    private course c1 = new course("Math",subject1);
    private course c2 = new course("Calc",subject2);
    private course c3 = new course("AI",subject3);

    public data() {
        subject1.add(new subject("Number Theory"));
        subject1.add(new subject("Algebra"));
        subject1.add(new subject("Geometry"));
        subject1.add(new subject("Arithmetic"));
        subject1.add(new subject("Combinatorics"));

        subject2.add(new subject("Limits"));
        subject2.add(new subject("Differential"));
        subject2.add(new subject("Integral"));
        subject2.add(new subject("Special functions and numbers"));
        subject2.add(new subject("Multivariable"));

        subject3.add(new subject("Thinking humanly"));
        subject3.add(new subject("Thinking rationally"));
        subject3.add(new subject("Acting humanly"));
        subject3.add(new subject("Acting rationally"));

        level1.add(c1);

        level2.add(c2);
        level2.add(c1);

        level3.add(c3);
        level3.add(c2);
        level3.add(c1);

    }


    public List<course> getLevel1() {
        return level1;
    }

    public List<course> getLevel2() {
        return level2;
    }

    public List<course> getLevel3() {
        return level3;
    }

}