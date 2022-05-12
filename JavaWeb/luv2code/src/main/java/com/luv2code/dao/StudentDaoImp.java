package com.luv2code.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.models.Student;

public class StudentDaoImp implements StudentDao {
	private SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	
	public StudentDaoImp() {
		
	}
	@Override
	public void add(Student u) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		String hql = "INSERT INTO student(firstName,lastName,email) VALUES(:firstName,:lastName,:email)";
//		Query query = session.createQuery(hql);
//		query.setParameter("firstName","Said");
//		query.setParameter("lastName","Said");
//		query.setParameter("email", "saidjunks@gmail.com");
//		Student u = new Student("Said","Learns","saidjunks@gmail.com");
		session.save(u);
		t.commit();
	}

	@Override
	public void update(int id,Student n) {
		Session session = factory.openSession();
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		Student s = session.get(Student.class, id);
		s.setEmail(n.getEmail());
		s.setFirstName(n.getFirstName());
		s.setLastName(n.getLastName());
		session.update(s);
		t.commit();
		session.close();
	
	}

	@Override
	public void delete(int id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student s = session.get(Student.class, id);
		session.remove(s);
		t.commit();
		session.close();
	
		
	}

	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		String hql = "FROM Student s WHERE s.id=:id";
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		Student s = session.get(Student.class, id);
		Query query =session.createQuery(hql);
		query.setParameter("id",id);
		Student s = (Student) query.getSingleResult();
		session.close();
		return s;
	}

	@Override
	public List<Student> getAll() {
		String hql = "FROM Student s";
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Student> students = query.getResultList();
		return students;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
		String sql = "TRUNCATE TABLE Student";
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createNativeQuery(sql);
		query.executeUpdate();
		t.commit();
		t.rollback();
		
	}
	
}
