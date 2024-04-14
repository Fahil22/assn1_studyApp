package com.example.assienment1;

import java.util.ArrayList;
import java.util.List;

public class course {
    public List<subject> subject;
    public String name;



    course(String name, List<subject> subject) {
        this.name = name;
        this.subject = subject;
    }



    public String getName() {
        return name;
    }

    public List<subject> getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return name;
    }
}
