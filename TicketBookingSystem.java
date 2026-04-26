/*
* Problem 1: Train Ticket Booking System
Scenario: A railway company has developed a ticket booking system. When a passenger tries to
book a ticket, the system checks whether seats are available. If the requested number of seats
exceeds the available seats, the system should throw an exception.
Required Classes
• Train
• SeatNotAvailableException
• TicketBookingSystem
Required Methods
• bookTicket(int seats)
• checkAvailableSeats()
Implementation Idea
The Train class stores the total number of available seats. When the bookTicket() method is
called, it checks whether the requested seats are greater than the available seats. If so, a
SeatNotAvailableException is thrown. Otherwise, the seat count is reduced. The
TicketBookingSystem class calls the method inside a try-catch block and prints the result.
* */

class SeatNotAvailableException extends Exception{
    SeatNotAvailableException (String msg){
        super(msg);
    }
}

class Train{
    int seats;
    Train(int seats){
        this.seats=seats;
    }
    void checkAvailableSeats(){
        System.out.println("Available seats: "+seats);
    }
    void bookTicket(int reqSeats) throws SeatNotAvailableException{
        if(reqSeats>seats) throw new SeatNotAvailableException("Not enough seats !");

        seats-=reqSeats;
        System.out.println("Booked : "+reqSeats);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Train t=new Train(10);
        try{
            t.checkAvailableSeats();
            t.bookTicket(4);
            t.bookTicket(3);
            t.bookTicket(6);
        }
        catch (SeatNotAvailableException e){
            System.out.println(e.getMessage());
        }
        t.checkAvailableSeats();
    }
}
