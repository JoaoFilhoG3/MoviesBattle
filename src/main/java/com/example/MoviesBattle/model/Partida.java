package com.example.MoviesBattle.model;

public class Partida {
    private Long codigo;
    private Jogador jogador;
    private int numErros;
    private double pontuacao;

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

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
}
