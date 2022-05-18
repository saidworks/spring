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
		String hql = "FROM Course";
		Query<Course> query = session.createQuery(hql);
		List<Course> courses = query.getResultList();
		return courses;
	}
//	public static void main(String[] args) {
//	CourseService cs = new CourseService();
//
//
//	List<Course> availableCourses = 	cs.getAllCourses();;
//	System.out.println("Please choose from the following courses and type number corresponding to the course: ");
//	for(Course c:availableCourses) {
//		System.out.printf("%30s %1s %30s %1s %30s\n",c.getcId(),'|',c.getcName(),'|', c.getcInstructorName());
//	}
//	}
}
