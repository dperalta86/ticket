package com.dperalta.ticket.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class Rol implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String authority;

    // Getters y Setters omitidos por simplicidad

    @Override
    public String getAuthority() {
        return authority;
    }
}
