package com.perscholas.controller;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.User;

public class findUser_Hql {
	public void findUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "FROM User";
		Query query = session.createQuery(hql);
		List<User> results = query.getResultList();
		for(User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + "Full name:" 
		+ u.getFullname() + "|" + "Email: "+ u.getEmail() + "| Password" + u.getPassword());
			
		}
		
	}
	
	public void findUserSelect() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "SELECT u FROM User u";
		Query query =  session.createQuery(hql);
		List<User> results = query.getResultList();
		for(User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + "Full name:" 
		+ u.getFullname() + "|" + "Email: "+ u.getEmail() + "| Password" + u.getPassword());
			
		}
		
	}
	
	public void getRecordbyId(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT U FROM User U WHERE U.id < :id ORDER BY U.id DESC";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		List<User> results = query.getResultList();
		for(User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + "Full name:" 
		+ u.getFullname() + "|" + "Email: "+ u.getEmail() + "| Password" + u.getPassword());
			
		}
				
	}
	
	public void getmaxSalary() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		String hql = "SELECT MAX(u.salary) FROM User u";
		Query query = session.createQuery(hql);
		double maxSalary = (double) query.getSingleResult();
		System.out.println("Maximum Price: " + maxSalary);
	}
}
