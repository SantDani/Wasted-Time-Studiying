package com.wastedTimeStudiyng.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Student {

	private int id;
	
	private String name;
	
	private List<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(int id, String name, List<Subject> subjectList) {
		super();
		this.id = id;
		this.name = name;
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
	
}
