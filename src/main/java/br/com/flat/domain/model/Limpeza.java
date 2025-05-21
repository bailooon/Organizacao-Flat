package br.com.flat.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Limpeza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comodo;

    @Column(nullable = false)
    private LocalDate data;
}
