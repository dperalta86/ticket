package com.dperalta.ticket.controllers;

import com.dperalta.ticket.entities.Evento;
import com.dperalta.ticket.repositories.EventoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/inicio")
public class IndexController {
    private EventoRepository eventoRepository;

    public IndexController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping("/eventos")
    public List<Evento> getEventos() {
        //Inicialmente, devuelvo lista completa de Eventos. Luego se podría modificar para mostrar eventos "relevantes"
        return eventoRepository.findAll();
    }
}
