package Ticket;

import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class Ticket {
   public UUID ticketId;
    public String eventName;
    public String seatNumber;
    public double price;
    public Date eventDate;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", eventName='" + eventName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", price=" + price +
                ", eventDate=" + eventDate +
                '}';
    }
}