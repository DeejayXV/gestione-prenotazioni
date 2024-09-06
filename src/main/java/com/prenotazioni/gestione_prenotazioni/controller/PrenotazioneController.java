package com.prenotazioni.gestione_prenotazioni.controller;

import com.prenotazioni.gestione_prenotazioni.model.Prenotazione;
import com.prenotazioni.gestione_prenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @PostMapping
    public ResponseEntity<Prenotazione> creaPrenotazione(@RequestBody Prenotazione prenotazione) {
        Prenotazione nuovaPrenotazione = prenotazioneService.creaPrenotazione(
                prenotazione.getUtente(),
                prenotazione.getPostazione(),
                prenotazione.getDataPrenotazione()
        );
        return ResponseEntity.ok(nuovaPrenotazione);
    }
}
