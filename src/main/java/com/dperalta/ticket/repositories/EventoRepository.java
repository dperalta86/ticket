package com.dperalta.ticket.repositories;

import com.dperalta.ticket.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
