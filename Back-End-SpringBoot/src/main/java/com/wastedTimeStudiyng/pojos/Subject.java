package com.wastedTimeStudiyng.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Subject {

	public enum Difficulty{
		EASY,
		MEDIUM,
		HARD,
		RIP
	}
	
	private int id;
	
	private String name;
	
	private Difficulty difficulty;
	
	public Subject(int id, String name, Difficulty difficulty) {
		super();
		this.id = id;
		this.name = name;
		this.difficulty = difficulty;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	
}
