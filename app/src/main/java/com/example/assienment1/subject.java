package com.example.assienment1;

public class subject {
    private String name;


    public subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
