package com.example.sport.sportout.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.sportout.models.MatchModel;
import com.example.sport.sportout.repositories.MatchRepository;
import com.example.sport.sportout.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService{

	@Autowired
	private MatchRepository mRepo;
	
	@Override
	public List<MatchModel> getAllMatches() {
		
		return mRepo.findAll();
	}

	@Override
	public MatchModel getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> m = mRepo.findById(id);
		return m.isPresent() ? m.get() : null;
	}

	@Override
	public void deleteMatchById(Long id) {
		// TODO Auto-generated method stub
		mRepo.deleteById(id);
		
	}

	@Override
	public MatchModel addMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return mRepo.save(m);
	}

	@Override
	public MatchModel updateMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return mRepo.save(m);
	}

}
