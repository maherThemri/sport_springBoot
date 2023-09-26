/**
 * 
 */
package com.example.sport.sportout.servicesImpl;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.sport.sportout.models.TeamModel;
import com.example.sport.sportout.repositories.TeamRepository;
import com.example.sport.sportout.services.TeamService;

import org.springframework.data.domain.Sort;

/**
 * 
 */
@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepository tRepo;

	@Override
	public Page<TeamModel> getAllTeams(int page, int size, String sortBy, String searchTerm) {
        Sort sort = Sort.by(sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);
        return tRepo.findByNameContainingIgnoreCase(searchTerm,pageable);
    }

	@Override
	public TeamModel addTeam(TeamModel team) {
		return tRepo.save(team);
	}

	@Override
	public TeamModel updateTeam(TeamModel team) {
		return tRepo.save(team);
	}

	@Override
	public TeamModel getTeamById(Long id) {
		Optional<TeamModel> t = tRepo.findById(id);
		return t.isPresent()? t.get() : null;
	}

	@Override
	public void deleteTeamById(Long id) {
		tRepo.deleteById(id);
		
	}

	

}
