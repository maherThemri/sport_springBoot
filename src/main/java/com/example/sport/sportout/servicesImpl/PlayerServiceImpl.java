package com.example.sport.sportout.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.sportout.models.PlayerModel;
import com.example.sport.sportout.repositories.PlayerRepository;
import com.example.sport.sportout.services.PlayerService;
@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository pRepo;

	@Override
	public List<PlayerModel> getAllPlayers() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public PlayerModel getPlayerById(Long id) {
		// TODO Auto-generated method stub
		Optional<PlayerModel> p = pRepo.findById(id);
		return p.isPresent() ? p.get() : null;
	}

	@Override
	public PlayerModel addPlayer(PlayerModel p) {
		// TODO Auto-generated method stub
		return pRepo.save(p);
	}

	@Override
	public PlayerModel updatePlayer(PlayerModel p) {
		// TODO Auto-generated method stub
		return pRepo.save(p);
	}

	@Override
	public void deletePlayer(Long id) {
		// TODO Auto-generated method stub
		pRepo.deleteById(id);
		
	}

}
