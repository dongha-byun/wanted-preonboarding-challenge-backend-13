package com.wanted.preonboarding.theater.service.handler;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTicketTo(Audience audience) {
        Ticket ticket = ticketOffice.sellTicket();

        audience.getBag().setTicket(ticket);
        audience.getBag().minusAmount(ticket.getFee());
    }

    public void giveTicketTo(Audience audience) {
        Ticket ticket = ticketOffice.giveTicket();

        audience.getBag().setTicket(ticket);
    }
}
