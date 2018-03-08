package com.glider.dao;

import com.glider.model.City;
import com.glider.model.Journey;
import com.glider.model.Passenger;
import com.glider.model.Ticket;
import com.glider.storage.TicketStorage;
import org.springframework.stereotype.Repository;

@Repository
public class TicketCommunicator {

    public void createTicket(Passenger passenger, Journey journey, City source, City destination)
    {
        TicketStorage.getInstance().addTicket(new Ticket(passenger,journey.getFlight(),source,destination,7503.0,passenger.getPassengerId()));
        System.out.println("\n\nBooking Info..");
        System.out.println("Name :"+passenger.getName());
        System.out.println("flight ID :"+journey.getFlight().getFlightId());
        System.out.println("Source :"+source.getName());
        System.out.println("Source :"+destination.getName());
        System.out.println("Price : 7503.0");
        System.out.println("Ticket ID :"+passenger.getPassengerId());
        System.out.println("Booking Successfull");
    }

    public void removeTicket(String pnr)
    {
        TicketStorage.getInstance().removeTicket(pnr);
    }
}
