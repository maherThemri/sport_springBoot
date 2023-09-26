package com.example.sport.sportout.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEAMS")
public class TeamModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TEAM_ID")
	private Long id;
	@Column(name="TEAM_NAME")
	private String name;
	@Column(name="TEAM_OWNER")
	private String owner;
	@Column(name="TEAM_FOUNDATION")
	private Date foundation;
	
	public TeamModel() {
		
	}

	/**
	 * @param name
	 * @param owner
	 * @param foundation
	 */
	public TeamModel(String name, String owner, Date foundation) {
		
		this.name = name;
		this.owner = owner;
		this.foundation = foundation;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the foundation
	 */
	public Date getFoundation() {
		return foundation;
	}

	/**
	 * @param foundation the foundation to set
	 */
	public void setFoundation(Date foundation) {
		this.foundation = foundation;
	}

	@Override
	public String toString() {
		return "TeamModel [id=" + id + ", name=" + name + ", owner=" + owner + ", foundation=" + foundation + "]";
	}
	
	
	
	
	
}
