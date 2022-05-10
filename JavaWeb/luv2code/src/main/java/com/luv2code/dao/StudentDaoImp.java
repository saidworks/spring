package com.luv2code.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.models.Student;

public class StudentDaoImp implements StudentDao {
	private SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	private Session session = factory.openSession();
	public StudentDaoImp() {
		
	}
	@Override
	public void add() {
		Transaction t = session.beginTransaction();
//		String hql = "INSERT INTO student(firstName,lastName,email) VALUES(:firstName,:lastName,:email)";
//		Query query = session.createQuery(hql);
//		query.setParameter("firstName","Said");
//		query.setParameter("lastName","Said");
//		query.setParameter("email", "saidjunks@gmail.com");
		Student u = new Student("Said","Learns","saidjunks@gmail.com");
		session.save(u);
		t.commit();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
