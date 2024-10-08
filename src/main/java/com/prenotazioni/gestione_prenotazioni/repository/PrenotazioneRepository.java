package com.prenotazioni.gestione_prenotazioni.repository;

import com.prenotazioni.gestione_prenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
