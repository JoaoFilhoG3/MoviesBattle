package com.example.MoviesBattle.client.imdbFilme;

import java.beans.Transient;

public class FilmeImDb {

    public FilmeImDb() {
    }

    private String id;
    private Integer rank;
    private String title;
    private String fullTitle;
    private Integer year;
    private String image;
    private String crew;
    private Double imDbRating;
    private Long imDbRatingCount;

    public String getId() {
        return id;
    }

    public Integer getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public Integer getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

    public String getCrew() {
        return crew;
    }

    public Double getImDbRating() {
        return imDbRating;
    }

    public Long getImDbRatingCount() {
        return imDbRatingCount;
    }

    @Transient
    public Double getPontuation() {
        return this.imDbRating * this.imDbRatingCount;
    }
}
