package com.example.MoviesBattle.controller;

import com.example.MoviesBattle.model.Partida;
import com.example.MoviesBattle.model.Rodada;
import com.example.MoviesBattle.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/play")
public class PartidaController {

    @Autowired
    private PartidaRepository partidaRepository;

    @PostMapping
    private Partida initGame() {
        Partida partida = new Partida();
        partida.loadFilmes();
        return partida;
    }
}
