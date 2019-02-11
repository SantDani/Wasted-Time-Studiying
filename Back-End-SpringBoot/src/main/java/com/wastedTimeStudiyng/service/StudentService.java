package com.wastedTimeStudiyng.service;

import java.util.List;

import com.wastedTimeStudiyng.pojos.Student;

public interface StudentService {

	//CRUD
	public List<Student> getStudents();
	public Student getStudentById(int id);
	public void createStudent(Student student);
	public void updateStudent(String dni, Student student);
	public void deleteStudent(String dni);
	
	//Other methods
	public Student getStudentByDni(String dni);
	
}
