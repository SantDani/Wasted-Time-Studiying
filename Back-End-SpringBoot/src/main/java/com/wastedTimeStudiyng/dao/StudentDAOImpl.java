package com.wastedTimeStudiyng.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wastedTimeStudiyng.pojos.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> getStudents() {
		Session session = sessionFactory.getCurrentSession();

		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		Root<Student> root = cq.from(Student.class);
		cq.select(root);
		Query<Student> query = session.createQuery(cq);

		return query.getResultList();
	}

	public Student getStudentById(int id) {
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}

	public Student getStudentByDni(String dni) {
		return sessionFactory.getCurrentSession().get(Student.class, dni);
	}

	@Override
	public void createStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public void updateStudent(String dni, Student studentParam) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.byId(Student.class).load(studentParam.getId());
		student.setDni(studentParam.getDni());
		student.setName(studentParam.getName());
		student.setEmail(studentParam.getEmail());
		student.setSubjectList(studentParam.getSubjectList());
		session.flush();
	}

	@Override
	public void deleteStudent(String dni) {
		
		Session session = sessionFactory.getCurrentSession();
		Student student = session.byId(Student.class).load(this.getStudentByDni(dni).getId());
		session.delete(student);

	}


}
