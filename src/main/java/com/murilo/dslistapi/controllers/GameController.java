package com.murilo.dslistapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.dslistapi.dto.GameMinDTO;
import com.murilo.dslistapi.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll(){
		List<GameMinDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
	}
	
}
