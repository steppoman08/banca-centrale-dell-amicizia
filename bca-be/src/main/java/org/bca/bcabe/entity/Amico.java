package org.bca.bcabe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Amico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Amico {

    @Id
    private Integer idAmico;

    private String nome;
    private String cognome;
    private String soprannome;
}
