package livehouses;

import livehouses.db.DB;

public class Ticket {
    private int ticketId;
    private Event event;
    private double price;

    public Ticket(Event to, int ticketId, double price) {
        this.event = to;
        this.ticketId = ticketId;
        this.price = price;
    }

    public SystemUser getOwner() {
        return DB.getOnwerOfTicket(this.ticketId);
    }

    public void setTicketId(int ticketId) { this.ticketId = ticketId; }
    public void setEvent(Event event) { this.event = event; }
    public void setPrice(double price) { this.price = price; }

    public boolean isValidPrice() { return this.price > 0; }
    public boolean isValidTicket() { return DB.validateTicket(this.ticketId); }
}


