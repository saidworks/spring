package com.perscholas.jpa.service;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.jpa.dao.CourseDAO;
import com.perscholas.jpa.entitymodels.Course;

public class CourseService implements CourseDAO{
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public CourseService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> getAllCourses() {
		Session session = factory.openSession();
		List<Course> courses = null;
	try {	
		String hql = "FROM Course";
		Query<Course> query = session.createQuery(hql);
		courses = query.getResultList();
		}
	catch(Exception e){
		e.getMessage();	
		}
	return courses;
	}
	
}
