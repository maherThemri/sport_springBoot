/**
 * 
 */
package com.example.sport.sportout.services;



import org.springframework.data.domain.Page;

import com.example.sport.sportout.models.TeamModel;

/**
 * 
 */
public interface TeamService {
	
	public Page<TeamModel>getAllTeams(int page, int size, String sortBy, String searchTerm);
	
	public TeamModel addTeam(TeamModel team);
	
	public TeamModel updateTeam(TeamModel team);
	
	public TeamModel getTeamById(Long id);
	
	public void deleteTeamById(Long id);

}
