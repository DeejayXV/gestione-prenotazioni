package com.prenotazioni.gestione_prenotazioni.controller;

import com.prenotazioni.gestione_prenotazioni.model.Postazione;
import com.prenotazioni.gestione_prenotazioni.model.enums.TipoPostazione;
import com.prenotazioni.gestione_prenotazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postazioni")
public class PostazioneController {

    @Autowired
    private PostazioneRepository postazioneRepository;

    @GetMapping
    public List<Postazione> getPostazioni(@RequestParam TipoPostazione tipo, @RequestParam String citta) {
        return postazioneRepository.findByTipoAndEdificioCitta(tipo, citta);
    }
}
