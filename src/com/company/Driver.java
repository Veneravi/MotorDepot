package com.company;

public class Driver {
    private String name;
    private int id;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Driver(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return " driver-" + id + " " + name ;
    }
}
