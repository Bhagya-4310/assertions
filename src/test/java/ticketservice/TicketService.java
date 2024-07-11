package ticketservice;

import Ticket.Seat;
import Ticket.Service;
import Ticket.Ticket;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicketService {
@Test
    public void getTicket(){
    Seat seat=new Seat();
    seat.totalNoOfSeats=20;
    seat.filledSeats=10;
    seat.requiredSeats=5;
    seat.remainingSeats=seat.totalNoOfSeats-seat.filledSeats;
    Service service=new Service();
    System.out.println(service.ticketBooking(seat));
    Ticket ticket=service.ticketBooking(seat);
    assertNotNull(seat.requiredSeats);
}
}