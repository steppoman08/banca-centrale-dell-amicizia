package org.bca.bcabe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Amico {

    @Id
    private UUID idAmico;

    private String nome;
    private String cognome;
    private String soprannome;
}
