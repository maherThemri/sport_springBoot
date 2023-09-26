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

import com.example.sport.sportout.models.MatchModel;
import com.example.sport.sportout.services.MatchService;

@RestController
@RequestMapping("api/matches")
@CrossOrigin("*")
public class MatchController {
	
	@Autowired
	public MatchService mService;
	
	@GetMapping
	public List<MatchModel> getAll(){
		return mService.getAllMatches();
	}
	@GetMapping("/{id}")
	public MatchModel getById(@PathVariable Long id) {
		return mService.getMatchById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		mService.deleteMatchById(id);
	}
	
	@PostMapping
	public MatchModel add(@RequestBody MatchModel obj) {
		return mService.addMatch(obj);
	}
	
	@PutMapping
	public MatchModel updateMatch(@RequestBody MatchModel obj) {
		return mService.updateMatch(obj);
	}
	

}
