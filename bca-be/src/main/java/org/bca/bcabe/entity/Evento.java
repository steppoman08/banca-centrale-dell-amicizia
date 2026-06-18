package org.bca.bcabe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.*;

@Entity
public class Evento {

    @Id
    private UUID idEvento;

    private String titolo;
    private LocalDate data;
    private String luogo;
    private Integer prezzoToken;
    private Integer idOrganizzatore;
    private List<Integer> listaPartecipanti;
}
