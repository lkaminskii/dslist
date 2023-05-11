package edu.dev.api.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.dev.api.dslist.dto.GameMinDTO;
import edu.dev.api.dslist.entities.Game;
import edu.dev.api.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> getAll () {
		List<GameMinDTO> result = gameService.getAll();
		return result;
	}

}
