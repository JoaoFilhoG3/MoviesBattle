package com.example.MoviesBattle.controller;

import com.example.MoviesBattle.client.imdbFilme.ImdbFilmeClient;
import com.example.MoviesBattle.model.Filme;
import com.example.MoviesBattle.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private ImdbFilmeClient filmeClient;

    @PostMapping
    private Filme addFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    @GetMapping
    public List<Filme> getFilmes() {
        if (filmeRepository.findAll().isEmpty()) {
            List<Filme> lFilmes = filmeClient.getFilmes().getItems();
            lFilmes.forEach(filme -> addFilme(filme));
        }
        return filmeRepository.findAll();
    }
}
