package com.wastedTimeStudiyng.pojos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {

	public enum Difficulty{
		EASY,
		MEDIUM,
		HARD,
		RIP
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Difficulty difficulty;
	
	@ManyToOne
	@JoinColumn(name="id_student")
	private Student student;
	
	public Subject() {
	}
	
	public Subject(int id, String name, Difficulty difficulty, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.difficulty = difficulty;
		this.student = student;
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
