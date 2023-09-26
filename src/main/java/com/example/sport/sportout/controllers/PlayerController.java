package com.example.sport.sportout.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sport.sportout.models.PlayerModel;
import com.example.sport.sportout.services.PlayerService;

@RestController
@RequestMapping(path="api/players")
@CrossOrigin("*")
public class PlayerController {
	
	@Autowired
	public PlayerService pService;
	
	@GetMapping
	public List<PlayerModel>getAllPlayers(){
		return pService.getAllPlayers();
	}
	@PostMapping
	public PlayerModel add(@RequestBody PlayerModel obj) {
		return pService.addPlayer(obj);
	}
	@GetMapping("/{id}")
	public PlayerModel getById(@PathVariable Long id) {
		return pService.getPlayerById(id);
	}
	@PutMapping
	public PlayerModel update(@RequestBody PlayerModel obj) {
		return pService.updatePlayer(obj);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		 pService.deletePlayer(id);
	}
}
