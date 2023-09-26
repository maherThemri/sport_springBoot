package com.example.sport.sportout.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYERS")
public class PlayerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PLAYER_ID")
	private Long id;
	@Column(name="PLAYER_NAME")
	private String name;
	@Column(name="PLAYER_AGE")
	private int age;
	@Column(name="PLAYER_POSITION")
	private String position;
	@Column (name="PLAYER_NUMBER")
	private int number;
	
	
	

	public PlayerModel() {
		
	}

	public PlayerModel(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PlayerModel [id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", number="
				+ number + "]";
	}
	
	
}
