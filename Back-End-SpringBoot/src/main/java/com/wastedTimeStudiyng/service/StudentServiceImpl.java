package com.wastedTimeStudiyng.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wastedTimeStudiyng.dao.StudentDAO;
import com.wastedTimeStudiyng.pojos.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Student> getStudents() {
		return this.studentDao.getStudents();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	@Transactional
	@Override
	public void createStudent(Student student) {
		this.studentDao.createStudent(student);
	}

	@Transactional
	@Override
	public void updateStudent(String dni, Student student) {
		this.studentDao.updateStudent(dni, student);
	}

	@Transactional
	@Override
	public void deleteStudent(String dni) {
		this.studentDao.deleteStudent(dni);
	}

	@Transactional(readOnly = true)
	@Override
	public Student getStudentByDni(String dni) {
		return this.studentDao.getStudentByDni(dni);
	}

}
