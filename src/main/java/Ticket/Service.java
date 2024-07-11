package Ticket;

import java.util.Date;
import java.util.UUID;
 public class Service {
   public Ticket ticketBooking(Seat seat){
        Ticket ticket=null;
        if(seat.remainingSeats >= seat.requiredSeats){
            ticket =new Ticket();
            ticket.ticketId= UUID.randomUUID();
            ticket.seatNumber="7";
            ticket.eventDate=new Date();
            ticket.eventName="kalki";
            ticket.price=300;
        }
        return ticket;
  }
}