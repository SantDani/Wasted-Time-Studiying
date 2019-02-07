package com.wastedTimeStudiyng.service;

import java.util.List;

import com.wastedTimeStudiyng.pojos.Student;

public interface StudentService {

	public List<Student> getStudents();
	public Student getStudent(int id);
	
}
