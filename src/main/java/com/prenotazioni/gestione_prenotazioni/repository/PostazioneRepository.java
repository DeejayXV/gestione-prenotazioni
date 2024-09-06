package com.prenotazioni.gestione_prenotazioni.repository;

import com.prenotazioni.gestione_prenotazioni.model.Postazione;
import com.prenotazioni.gestione_prenotazioni.model.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificioCitta(TipoPostazione tipo, String citta);
}
