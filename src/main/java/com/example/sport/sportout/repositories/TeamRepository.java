package com.example.sport.sportout.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sport.sportout.models.TeamModel;


@Repository
public interface TeamRepository extends JpaRepository<TeamModel, Long> {

	Page<TeamModel> findByNameContainingIgnoreCase(String searchTerm, Pageable pageable);

}
