package com.murilo.dslistapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.dslistapi.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
