package com.company;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String namre) {
        this.name = namre;
    }
    @Override
    public String toString() {
        return " " + name;
    }
}
