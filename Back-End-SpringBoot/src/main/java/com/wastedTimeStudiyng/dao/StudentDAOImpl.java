package com.wastedTimeStudiyng.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wastedTimeStudiyng.pojos.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> getStudents() {
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	public Student getStudent(int id) {
		return null;
	}

}
