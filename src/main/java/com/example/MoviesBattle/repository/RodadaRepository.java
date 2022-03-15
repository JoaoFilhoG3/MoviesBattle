package com.example.MoviesBattle.repository;

import com.example.MoviesBattle.model.Rodada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RodadaRepository extends JpaRepository<Rodada, Long> {
}
