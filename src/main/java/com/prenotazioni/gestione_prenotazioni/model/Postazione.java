package com.prenotazioni.gestione_prenotazioni.model;

import com.prenotazioni.gestione_prenotazioni.model.enums.TipoPostazione;
import jakarta.persistence.*;

@Entity
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codiceUnivoco;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    private int maxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    // Getters e Setters
}
