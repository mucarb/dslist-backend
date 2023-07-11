package com.murilo.dslistapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.dslistapi.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
