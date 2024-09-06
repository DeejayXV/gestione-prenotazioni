package com.prenotazioni.gestione_prenotazioni.service;

import com.prenotazioni.gestione_prenotazioni.model.Prenotazione;
import com.prenotazioni.gestione_prenotazioni.model.Postazione;
import com.prenotazioni.gestione_prenotazioni.model.Utente;
import com.prenotazioni.gestione_prenotazioni.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione creaPrenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(dataPrenotazione);

        return prenotazioneRepository.save(prenotazione);
    }
}
