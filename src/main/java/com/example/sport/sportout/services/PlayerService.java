package com.example.sport.sportout.services;

import java.util.List;

import com.example.sport.sportout.models.PlayerModel;

public interface PlayerService {
	
	public List<PlayerModel> getAllPlayers();
	
	public PlayerModel getPlayerById(Long id);
	
	public PlayerModel addPlayer(PlayerModel p);
	
	public PlayerModel updatePlayer(PlayerModel p);
	
	public void deletePlayer(Long id);

}
