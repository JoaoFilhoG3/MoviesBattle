package com.example.MoviesBattle.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String imdbId;
    private String title;
    private String image;
    private double imDbRating;
    private Long imDbRatingCount;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(double imDbRating) {
        this.imDbRating = imDbRating;
    }

    public Long getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(Long imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    @Transient
    public double getPontuation() {
        return imDbRating * imDbRatingCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return imdbId.equals(filme.imdbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imdbId);
    }
}
