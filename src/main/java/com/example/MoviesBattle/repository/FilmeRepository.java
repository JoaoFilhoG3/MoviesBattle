package com.example.MoviesBattle.repository;

import com.example.MoviesBattle.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    @Query("select f from Filme f order by RAND()")
    List<Filme> getFilmesInRandomOrder();
}
