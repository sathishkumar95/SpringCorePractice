package com.glider.storage;

import com.glider.model.Ticket;

import java.util.ArrayList;

public class TicketStorage {

    ArrayList<Ticket> tickets = null;
    static TicketStorage ticketStorage = null;

    public static TicketStorage getInstance(){
        if(ticketStorage == null)
        {
            ticketStorage = new TicketStorage();
            ticketStorage.tickets = new ArrayList<Ticket>();
        }

        return ticketStorage;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        ticketStorage.tickets = tickets;
    }

    public void removeTicket(String pnr)
    {
        for(Ticket ticket:tickets)
        {
            if(ticket.getId().equals(pnr))
            {
                System.out.println("\n\nBooking Cancelled");
                System.out.println("Ticket id :"+ticket.getId());
                ticketStorage.tickets.remove(ticket);

            }
            else
            {
                System.out.println("No Such Ticket Exist");
            }
        }

    }

    public void addTicket(Ticket ticket)
    {
        ticketStorage.tickets.add(ticket);
    }
}
