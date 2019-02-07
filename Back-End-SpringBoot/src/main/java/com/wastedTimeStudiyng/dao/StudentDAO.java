package com.wastedTimeStudiyng.dao;

import java.util.List;

import com.wastedTimeStudiyng.pojos.Student;

public interface StudentDAO {
	
	//Basic CRUD
	public List<Student> getStudents();
	public Student getStudent(int id);

}
