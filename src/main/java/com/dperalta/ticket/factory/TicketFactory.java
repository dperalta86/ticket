package com.dperalta.ticket.factory;

import com.dperalta.ticket.entities.*;

public class TicketFactory {
    public Ticket createTicket(String tipoTicket, Usuario usuario, Evento evento) {
        Ticket ticket;

        switch (tipoTicket) {
            case "VIP":
                ticket = new TicketVip();
                break;
            case "STANDARD":
            default:
                ticket = new TicketEstandard();
                break;
        }

        ticket.setUsuario(usuario);
        ticket.setEvento(evento);

        String codigoQR = generateQRCodeForTicket(ticket);
        ticket.setCodigoQR(codigoQR);

        return ticket;
    }

    private String generateQRCodeForTicket(Ticket ticket) {
        // Lógica para generar el código QR
        return "generatedQRCode";
    }
}
