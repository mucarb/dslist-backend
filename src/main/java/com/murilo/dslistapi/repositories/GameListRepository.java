package com.murilo.dslistapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.murilo.dslistapi.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	@Modifying // o @Modifying é usado quando não é uma operação de consulta (usado em INSERT,
				// UPDATE e DELETE)
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
