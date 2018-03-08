package com.glider;

import com.glider.model.City;
import com.glider.model.Flight;
import com.glider.model.Journey;
import com.glider.model.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.glider.services.PassengerManagerService;
import com.glider.storage.JourneyStorage;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        //Dummy passenger details
        Passenger passenger = new Passenger("passenger1","Sathish");
        Passenger passenger2 = new Passenger("passenger2","Ramesh");
        //Dummy flight
        Flight jetairways = new Flight("jetairways");

        City bangalore = new City("Bengaluru","SBC");
        City chennai = new City("Chennai","MAS");
        City hyderabad = new City("Hyderabad","HYD");

        //Dummy data for journeys
        ArrayList<Journey> journeys = new ArrayList<Journey>();
        Journey journey = new Journey(jetairways,bangalore,chennai);
        Journey journey2 = new Journey(jetairways,chennai,hyderabad);
        Journey journey3 = new Journey(jetairways,bangalore,hyderabad);
        journeys.add(journey);
        journeys.add(journey2);
        journeys.add(journey3);

        JourneyStorage.getInstance().setJourneys(journeys);
        PassengerManagerService passengerManagerService = (PassengerManagerService) context.getBean("passengerManagerService");
        passengerManagerService.bookTicket(passenger,bangalore,chennai);

        passengerManagerService.bookTicket(passenger2,bangalore,hyderabad);

        passengerManagerService.cancelTicket("passenger1");
    }
}
