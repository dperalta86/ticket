package com.dperalta.ticket.repositories;

import com.dperalta.ticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
