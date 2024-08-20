package com.dperalta.ticket.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Evento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private String nombreEvento;
    private LocalDate fechaEvento;
    private String horaEvento;
    private int capacidad;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets;

    public Long getId_evento() {
        return id_evento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
