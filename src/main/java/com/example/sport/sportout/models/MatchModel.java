package com.example.sport.sportout.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MATCHES")
public class MatchModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Long id;
	@Column(name="score_one")
	private int scoreOne;
	@Column(name="score_two")
	private int scoreTwo;
	@Column(name="team_one")
	private String teamOne;
	@Column(name="team_two")
	private String teamTwo;
	
	
	public MatchModel() {
	
	}


	public MatchModel(int scoreOne, int scoreTwo, String teamOne, String teamTwo) {
		
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	


	/**
	 * @return the scoreOne
	 */
	public int getScoreOne() {
		return scoreOne;
	}


	/**
	 * @param scoreOne the scoreOne to set
	 */
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}


	/**
	 * @return the scoreTwo
	 */
	public int getScoreTwo() {
		return scoreTwo;
	}


	/**
	 * @param scoreTwo the scoreTwo to set
	 */
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}


	/**
	 * @return the teamOne
	 */
	public String getTeamOne() {
		return teamOne;
	}


	/**
	 * @param teamOne the teamOne to set
	 */
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}


	/**
	 * @return the teamTwo
	 */
	public String getTeamTwo() {
		return teamTwo;
	}


	/**
	 * @param teamTwo the teamTwo to set
	 */
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}


	@Override
	public String toString() {
		return "MatchModel [id=" + id + ", scoreOne=" + scoreOne + ", scoreTwo=" + scoreTwo + ", teamOne=" + teamOne
				+ ", teamTwo=" + teamTwo + "]";
	}
	
	
	
	
	
	
}
