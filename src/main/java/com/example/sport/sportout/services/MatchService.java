package com.example.sport.sportout.services;

import java.util.List;

import com.example.sport.sportout.models.MatchModel;

public interface MatchService {
	
	public List<MatchModel>getAllMatches();
	
	public MatchModel getMatchById(Long id);
	
	public void deleteMatchById(Long id);
	
	public MatchModel addMatch(MatchModel m);
	
	public MatchModel updateMatch(MatchModel m);

}
