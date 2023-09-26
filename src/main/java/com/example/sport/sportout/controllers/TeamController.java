package com.example.sport.sportout.controllers;

import org.springframework.data.domain.Pageable; // Assurez-vous d'importer la classe Pageable correcte
import org.springframework.data.domain.Sort; // Assurez-vous d'importer la classe Sort correcte
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sport.sportout.models.TeamModel;
import com.example.sport.sportout.services.TeamService;

@RestController
@RequestMapping("/api/teams")
@CrossOrigin("*")

public class TeamController {
	
	@Autowired
	public TeamService teamService;
	
	@GetMapping
	public ResponseEntity<Page<TeamModel>> getAll(
			@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "") String searchTerm
            ){
		//Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<TeamModel> teams = teamService.getAllTeams(page, size, sortBy, searchTerm);
        return new ResponseEntity<>(teams, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public TeamModel getById(@PathVariable Long id) {
		return teamService.getTeamById(id);
	}
	@PostMapping
	public TeamModel add(@RequestBody TeamModel obj) {
		return teamService.addTeam(obj);
	}
	@PutMapping
	public TeamModel update(@RequestBody TeamModel obj) {
		return teamService.updateTeam(obj);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		teamService.deleteTeamById(id);
	}

}
