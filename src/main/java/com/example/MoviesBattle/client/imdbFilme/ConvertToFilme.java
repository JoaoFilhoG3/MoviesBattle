package com.example.MoviesBattle.client.imdbFilme;

import com.example.MoviesBattle.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class ConvertToFilme {
	
	public ConvertToFilme() {
	}
	
	public ConvertToFilme(List<FilmeImDb> items) {
		this.items = items;
	}

	private List<FilmeImDb> items;

	public List<Filme> getItems() {
		List<Filme> lFilmes = new ArrayList<Filme>();
		for (FilmeImDb filmeImDb : items){
			Filme filme = new Filme();
			filme.setImdbId(filmeImDb.getId());
			filme.setTitle(filmeImDb.getTitle());
			filme.setImage(filmeImDb.getImage());
			filme.setImDbRating(filmeImDb.getImDbRating());
			filme.setImDbRatingCount(filmeImDb.getImDbRatingCount());
			lFilmes.add(filme);
		}
		return lFilmes;
	}

}
