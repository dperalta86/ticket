package com.dperalta.ticket.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ticket {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_ticket;
    private String codigoQR;
    private boolean isValidated;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_evento", nullable = false)
    private Evento evento;

    public Long getId_ticket() {
        return id_ticket;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
