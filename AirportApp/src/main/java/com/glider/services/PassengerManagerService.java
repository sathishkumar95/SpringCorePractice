package com.glider.services;

import com.glider.dao.JourneyCommunicator;
import com.glider.dao.TicketCommunicator;
import com.glider.model.City;
import com.glider.model.Journey;
import com.glider.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PassengerManagerService {
    @Autowired
    @Qualifier("ticketCommunicator")
    TicketCommunicator ticketCommunicator = null;
    @Autowired
    @Qualifier("journeyCommunicator")
    JourneyCommunicator journeyCommunicator = null;

    public void bookTicket(Passenger passenger, City source, City destination)
    {
        Journey journey = journeyCommunicator.checkJourney(source,destination);
        if(journey!=null)
        {
            ticketCommunicator.createTicket(passenger,journey,source,destination);
        }
        else
        {
            System.out.println("No such Journey available, Ticket Not booked");
        }
    }

    public void cancelTicket(String pnr)
    {
        ticketCommunicator.removeTicket(pnr);
    }


}
