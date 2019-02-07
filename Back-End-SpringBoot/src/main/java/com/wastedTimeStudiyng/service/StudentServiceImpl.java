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
	public List<Student> getStudents() {
		return this.studentDao.getStudents();
	}
	
	@Transactional(readOnly = true)
	public Student getStudent(int id) {
		return this.studentDao.getStudent(id);
	}

}
