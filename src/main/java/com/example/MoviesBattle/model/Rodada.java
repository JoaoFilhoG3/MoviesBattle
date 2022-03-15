package com.example.MoviesBattle.model;

import javax.persistence.*;

@Entity
public class Rodada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @ManyToOne
    private Partida partida;
    @ManyToOne
    private Filme filme1;
    @ManyToOne
    private Filme filme2;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Filme getFilme1() {
        return filme1;
    }

    public void setFilme1(Filme filme1) {
        this.filme1 = filme1;
    }

    public Filme getFilme2() {
        return filme2;
    }

    public void setFilme2(Filme filme2) {
        this.filme2 = filme2;
    }
}
