package com.glider.model;

public class Passenger {

    String passengerId;
    String name;


    public Passenger(String passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;

    }



    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
