package com.company;

public class Depo2 {
    private int id;
    private Bus bus;
    private Driver driver;
    private State state;

    public Depo2(int id, Bus bus, Driver driver, State state) {
        this.id = id;
        this.bus = bus;
        this.driver = driver;
        this.state = state;
    }
    public Depo2(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return

                " -—+———————————+—————————+—————————\n" +
                        id + "  |" + bus + "      |          | " + state;
    }
    public static Depo2 makeDepo2 ( int id, Bus bus, Driver driver, State state  ){
        Depo2 depo2 = new Depo2();
        depo2.id = id;
        depo2.bus = bus;
        depo2.driver = driver;
        depo2.state = state;
        return depo2;
    }
}
