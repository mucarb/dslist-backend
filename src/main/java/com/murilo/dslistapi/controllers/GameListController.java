package com.murilo.dslistapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.dslistapi.dto.GameListDTO;
import com.murilo.dslistapi.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService service;

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		List<GameListDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
	}

}
