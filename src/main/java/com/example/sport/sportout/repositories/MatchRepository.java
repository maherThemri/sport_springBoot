package com.example.sport.sportout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sport.sportout.models.MatchModel;

@Repository
public interface MatchRepository extends JpaRepository<MatchModel, Long> {

}
