package com.perscholas.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.entity.Student;
import com.perscholas.entity.StudentGfgDetail;

public class AddBidirectionalDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Student s = new Student("Said","Chunks","saidjunks@gmail.com");
		StudentGfgDetail sd = new StudentGfgDetail("GFG College",0);
		s.setStudentGfgDetail(sd);
		sd.setStudent(s);
		session.save(sd);
		t.commit();
		session.close();
		factory.close();
		
		
	}
}
