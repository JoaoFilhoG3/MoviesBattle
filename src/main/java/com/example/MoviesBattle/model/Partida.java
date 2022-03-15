package com.example.MoviesBattle.model;

import com.example.MoviesBattle.controller.FilmeController;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @ManyToOne
    private Jogador jogador;
    private int numErros;
    private int rodada;
    private double pontuacao;
    private boolean finalizada;
    @Transient
    private List<Filme> lFilmes;

    public Partida() {
        setFinalizada(false);
        setRodada(1);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getNumErros() {
        return numErros;
    }

    public void setNumErros(int numErros) {
        this.numErros = numErros;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<Filme> getlFilmes() {
        return lFilmes;
    }

    public void setlFilmes(List<Filme> lFilmes) {
        this.lFilmes = lFilmes;
    }

    public void loadFilmes() {
        RestTemplate restTemplate = new RestTemplateBuilder().build();

        String url = "http://localhost:8080/filmes/random";

        ResponseEntity<Filme[]> response = restTemplate.getForEntity(url, Filme[].class);
        Filme[] filmes = response.getBody();


        this.lFilmes = Arrays.asList(filmes);
    }
}
