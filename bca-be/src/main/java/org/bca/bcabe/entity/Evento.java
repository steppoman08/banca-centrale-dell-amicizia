package org.bca.bcabe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "Evento")
public class Evento {

    @Id
    private Integer idEvento;

    private String titolo;
    private LocalDate data;
    private String luogo;
    private Integer prezzoToken;
    private Integer idOrganizzatore;
    private List<Integer> listaPartecipanti;
}
