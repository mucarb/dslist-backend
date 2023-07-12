package com.murilo.dslistapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.murilo.dslistapi.dto.GameDTO;
import com.murilo.dslistapi.dto.GameMinDTO;
import com.murilo.dslistapi.entities.Game;
import com.murilo.dslistapi.projections.GameMinProjection;
import com.murilo.dslistapi.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repository.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}


	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = repository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
