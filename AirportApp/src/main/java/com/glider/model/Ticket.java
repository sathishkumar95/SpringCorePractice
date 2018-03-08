package com.glider.model;



public class Ticket {

    Passenger passenger;
    Flight flight;
    City source;
    City destination;
    Double price;
    String id;

    public Ticket(Passenger passenger, Flight flight, City source, City destination, Double price, String id) {
        this.passenger = passenger;
        this.flight = flight;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
