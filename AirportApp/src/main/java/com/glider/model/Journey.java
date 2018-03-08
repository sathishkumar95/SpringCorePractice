package com.glider.model;


public class Journey {

    Flight flight=null;
    City source=null;
    City destination = null;

    public Journey(Flight flight, City source, City destination) {
        this.flight = flight;
        this.source = source;
        this.destination = destination;
    }

    public Flight getFlight() {
        return flight;
    }

    public City getSource() {
        return source;
    }

    public City getDestination() {
        return destination;
    }
}
