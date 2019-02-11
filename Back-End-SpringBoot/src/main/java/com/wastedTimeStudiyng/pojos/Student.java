package com.wastedTimeStudiyng.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String dni;
	private String email;
	
	@OneToMany(targetEntity=Subject.class, mappedBy="student", fetch=FetchType.EAGER)
	private List<Subject> subjectList = new ArrayList<Subject>();
	
	public Student() {
	}

	public Student(int id, String name, String dni, String email, List<Subject> subjectList) {
		super();
		this.id = id;
		this.name = name;
		this.dni = dni;
		this.email = email;
		this.subjectList = subjectList;
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
	
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
